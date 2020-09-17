package com.company.chapter21parallelexecution.examples.ex045banktellersimulation;

import java.io.IOException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * каждый клиент банка обслуживается за некоторое время, которое определяется случайным образом для каждого клиента. При этом заранее не
 * известно, сколько клиентов появится в каждый интервал; эта величина также определяется случайным образомpriva
 * Использование очередей и многопоточной модели.
 * Объекты, доступные только для чтения,
 * не требуют синхронизации:
 */
class Customer {
    private final int serviceTime;

    public int getServiceTime() {
        return serviceTime;
    }

    public Customer(int serviceTime) {
        this.serviceTime = serviceTime;
    }

    public String toString() {
        return "[" + serviceTime + "]";
    }
}

/**
 * очередь клиентов умеет выводить свое состояние
 */
class CustomerLine extends ArrayBlockingQueue<Customer> {
    public CustomerLine(int capacity) {
        super(capacity);
    }

    public String toString() {
        if (this.size() == 0)
            return "[EMPTY]";
        StringBuilder result = new StringBuilder();
        for (Customer c : this)
            result.append(c);
        return result.toString();
    }
}

class CustomerGenerator implements Runnable {
    private CustomerLine customers;
    private static Random random = new Random(47);

    public CustomerGenerator(CustomerLine customers) {
        this.customers = customers;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(random.nextInt(300));
                customers.put(new Customer(random.nextInt(1000)));
            }
        } catch (InterruptedException e) {
            System.out.println("CustomerGenerator interrupted");
        }
        System.out.println("CustomerGenerator terminating");
    }
}

class Teller implements Runnable, Comparable<Teller> {
    private static int counter = 0;
    private final int id = counter++;
    private int customerServed = 0;
    private CustomerLine customers;
    private boolean servingCustomerLine = true;

    public Teller(CustomerLine cq) {
        customers = cq;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                Customer customer = customers.take();
                TimeUnit.MILLISECONDS.sleep(customer.getServiceTime());
                synchronized (this) {
                    while (!servingCustomerLine)
                        wait();
                }
            }
        } catch (InterruptedException e) {
            System.out.println(this + " interrupted");
        }
        System.out.println(this + " terminating");
    }

    public synchronized void doSomethingElse() {
        customerServed = 0;
        servingCustomerLine = false;
    }

    public synchronized void serveCustomerLine() {
        assert !servingCustomerLine : "already serving: " + this;
        servingCustomerLine = true;
        notifyAll();
    }

    public String toString() {
        return "Teller " + id + " ";
    }

    public String shortString() {
        return "T " + id;
    }

    public synchronized int compareTo(Teller other) {
        return customerServed < other.customerServed ? -1 :
                (customerServed == other.customerServed ? 0 : 1);
    }
}

class TellerManager implements Runnable {
    private ExecutorService executorService;
    private CustomerLine customers;
    private PriorityQueue<Teller> workingTellers = new PriorityQueue<>();
    private Queue<Teller> tellersDoingOtherThings = new LinkedList<>();
    private int adjustmentPeriod;
    private static Random random = new Random(47);

    public TellerManager(ExecutorService e, CustomerLine customers, int adjustmentPeriod) {
        this.executorService = e;
        this.customers = customers;
        this.adjustmentPeriod = adjustmentPeriod;
        /**
         * начать с одного кассира
         */
        Teller teller = new Teller(customers);
        executorService.execute(teller);
        workingTellers.add(teller);
    }

    public void adjustTellerNumber() {
        /**
         * система управления - изменяя числа, можно выявить
         * проблемы стабильности в управляющем механизме
         * Если очередь сдишком длинная добавить кассира
         */
        if (customers.size() > 2) {
            /**
             * Если кассир отдыхает или не зянят другой задачей вернуть малого в студию
             */
            if (tellersDoingOtherThings.size() > 0) {
                Teller teller = tellersDoingOtherThings.remove();
                teller.serveCustomerLine();
                workingTellers.offer(teller);
                return;
            }
            Teller teller = new Teller(customers);
            executorService.execute(teller);
            workingTellers.add(teller);
            return;
        }
        /**
         * Убираем кассира если очередь достаточно короткая
         */
        if (workingTellers.size() > 1 && customers.size() / workingTellers.size() < 2)
            reassignOneTeller();
        /**
         * Если очередь отсутствует, достаточно одного кассира
         */
        if (customers.size() == 0)
            while (workingTellers.size() > 1)
                reassignOneTeller();
    }

    /***
     * отправить кассира на друшую работу или отдых
     */
    private void reassignOneTeller() {
        Teller teller = workingTellers.poll();
        teller.doSomethingElse();
        tellersDoingOtherThings.offer(teller);
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(adjustmentPeriod);
                adjustTellerNumber();
                System.out.print(customers + " { ");
                for (Teller teller : workingTellers) {
                    System.out.print(teller.shortString() + " ");
                }
                System.out.print("}");
            }
        } catch (InterruptedException e) {
            System.out.println(this + " interrupted");
        }
        System.out.println(this + " terminating");
    }

    public String toString() {
        return "TellerManager ";
    }
}

public class BankTellerSimulation {
    static final int MAX_LINE_SIZE = 50;
    static final int ADJUSTMENT_PERIOD = 1000;

    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        /**
         * Если очередь слишком длинная - клиент уходит
         */
        CustomerLine customers = new CustomerLine(MAX_LINE_SIZE);
        executorService.execute(new CustomerGenerator(customers));

        /**
         * менеджер добавляет и удаляет кассиров при необходимости
         *
         */
        executorService.execute(new TellerManager(executorService, customers, ADJUSTMENT_PERIOD));
        if (args.length > 0)
            TimeUnit.SECONDS.sleep(new Integer(args[0]));
        else {
            System.out.println("Press ENTER to quit ");
            System.in.read();
        }
        executorService.shutdownNow();
    }
}
