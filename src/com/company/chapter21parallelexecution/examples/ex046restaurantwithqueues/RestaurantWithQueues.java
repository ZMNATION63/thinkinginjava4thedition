package com.company.chapter21parallelexecution.examples.ex046restaurantwithqueues;

//import chapter019enumeratedtypes.ex.ex010food.Food;
//import chapter019enumeratedtypes.ex.ex011course.Course;

import com.company.chapter19enumeratedtypes.examples.ex010food.Food;
import com.company.chapter19enumeratedtypes.examples.ex011course.Course;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * заказ передается официанту, который передает его повару
 */
class Order {
    /**
     * объект передачи данных
     */
    private static int counter = 0;
    private final int id = counter++;
    private final Customer customer;
    private final WaitPerson waitPerson;
    private final Food food;

    public Order(Customer customer, WaitPerson waitPerson, Food food) {
        this.customer = customer;
        this.waitPerson = waitPerson;
        this.food = food;
    }

    public Food item() {
        return food;
    }

    public Customer getCustomer() {
        return customer;
    }

    public WaitPerson getWaitPerson() {
        return waitPerson;
    }

    public String toString() {
        return "Order: " + id + " item " + food + " for: " + customer + " served by: " + waitPerson;
    }
}

/**
 * повар возвращает готовое блюдо
 */
class Plate {
    private final Order order;
    private final Food food;

    public Plate(Order order, Food food) {
        this.order = order;
        this.food = food;
    }

    public Order getOrder() {
        return order;
    }

    public Food getFood() {
        return food;
    }

    @Override
    public String toString() {
        return food.toString();
    }
}

class Customer implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private final WaitPerson waitPerson;

    /**
     * почетитель может получить только одно блюдо за раз
     */
    private SynchronousQueue<Plate> placeSetting = new SynchronousQueue<>();

    public Customer(WaitPerson waitPerson) {
        this.waitPerson = waitPerson;
    }

    public void deliver(Plate p) throws InterruptedException {
        /**
         * блокирутеся только в том случае если посетитель еще не закончил с предыдущим блюдом
         */
        placeSetting.put(p);
    }

    @Override
    public void run() {
        for (Course course : Course.values()) {
            Food food = course.randomSelection();
            try {
                waitPerson.placeOrder(this, food);
                /**
                 * блокируется до получения блюда
                 */
                System.out.println(this + " eating " + placeSetting.take());
            } catch (InterruptedException e) {
                System.out.println(this + " waiting for " + course + " interrupted");
                break;
            }
        }
        System.out.println(this + " finished meal, leaving");
    }

    public String toString() {
        return "Customer " + id + " ";
    }
}

class WaitPerson implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private final Restaurant restaurant;
    BlockingQueue<Plate> filledOrders =
            new LinkedBlockingQueue<Plate>();

    public WaitPerson(Restaurant rest) {
        restaurant = rest;
    }

    public void placeOrder(Customer cust, Food food) {
        try {
/*
Вообще говоря, этот вызов не должен блокироваться,
потому что LinkedBlockingQueue не имеет
ограничений по размеру:
*/
            restaurant.orders.put(new Order(cust, this, food));
        } catch (InterruptedException e) {
            System.out.println(this + " placeOrder interrupted");
        }
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
/*
 Блокируется, пока блюдо не будет готово
*/
                Plate plate = filledOrders.take();
                System.out.println(this + "received " + plate +
                        " delivering to " +
                        plate.getOrder().getCustomer());
                plate.getOrder().getCustomer().deliver(plate);
            }
        } catch (InterruptedException e) {
            System.out.println(this + " interrupted");
        }
        System.out.println(this + " off duty");
    }

    public String toString() {
        return "WaitPerson " + id + " ";
    }
}

class Chef implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private final Restaurant restaurant;
    private static Random random = new Random(47);

    public Chef(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {

                /**
                 * Блокируются до появления заказа
                 */
                Order order = restaurant.orders.take();
                Food requestItem = order.item();

                /**
                 * Время на подготовку заказа
                 */
                TimeUnit.MILLISECONDS.sleep(random.nextInt(500));
                Plate plate = new Plate(order, requestItem);
                order.getWaitPerson().filledOrders.put(plate);

            }
        } catch (InterruptedException e) {
            System.out.println(this + " interrupted");
        }
        System.out.println(this + " off duty");
    }

    public String toString() {
        return "Chef " + id + " ";
    }
}

class Restaurant implements Runnable {
    private List<WaitPerson> waitPersons = new ArrayList<>();
    private List<Chef> chefs = new ArrayList<>();
    private ExecutorService executorService;
    private static Random random = new Random(47);
    BlockingQueue<Order> orders = new LinkedBlockingDeque<>();

    public Restaurant(ExecutorService e, int nWaitPersons, int nChefs) {
        executorService = e;
        for (int i = 0; i < nWaitPersons; i++) {
            WaitPerson waitPerson = new WaitPerson(this);
            waitPersons.add(waitPerson);
            executorService.execute(waitPerson);
        }
        for (int i = 0; i < nChefs; i++) {
            Chef chef = new Chef(this);
            chefs.add(chef);
            executorService.execute(chef);
        }
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {

                /**
                 * приходит новый посетитель
                 * ему назначают офицанта
                 */
                WaitPerson wp = waitPersons.get(random.nextInt(waitPersons.size()));
                Customer c = new Customer(wp);
                executorService.execute(c);
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Restaurant interrupted");
        }
        System.out.println("Restaurant closing");
    }
}

public class RestaurantWithQueues {
    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Restaurant restaurant = new Restaurant(executorService, 5, 2);
        executorService.execute(restaurant);
        if (args.length > 0)
            TimeUnit.MILLISECONDS.sleep(new Integer(args[0]));
        else {
            System.out.println("Press 'Enter' to quit");
            System.in.read();
        }
        executorService.shutdownNow();
    }
}
