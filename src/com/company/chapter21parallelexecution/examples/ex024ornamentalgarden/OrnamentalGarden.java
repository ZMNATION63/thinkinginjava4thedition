package com.company.chapter21parallelexecution.examples.ex024ornamentalgarden;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Count {
    private int count = 0;
    private Random rand = new Random(47);

    /**
     * Удаляем ключевое слово и увидим сбой в работе системы подсчета
     */
    public synchronized int increment() {
        int temp = count;
        if (rand.nextBoolean())
            Thread.yield();
        return (count = ++temp);
    }

    public synchronized int value() {
        return count;
    }
}

class Enterence implements Runnable {
    private static Count count = new Count();
    private static List<Enterence> enterences =
            new ArrayList<>();
    private int number = 0;
    /**
     * для чтения синхронизация не нужна
     */
    private final int id;
    private static volatile boolean canceled = false;

    //атомарная операция с volatile полем
    public static void cancel() {
        canceled = true;
    }

    public Enterence(int id) {
        this.id = id;
        /**
         * Задача остаетя в списке, так же предотвращает уничтожение
         * мертвых задач при уборке мусора
         */
        enterences.add(this);
    }

    @Override
    public void run() {
        while (!canceled) {
            synchronized (this) {
                ++number;
            }
            System.out.println(this + " Total:" + count.increment());
            try {
                TimeUnit.MICROSECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("sleep interrupted");
            }
        }
        System.out.println("Stopping" + this);
    }

    public synchronized int getValue() {
        return number;
    }

    public String toString() {
        return "Enterance " + id + ": " + getValue();
    }

    public static int getTotalCount() {
        return count.value();
    }

    public static int sumEnterances() {
        int sum = 0;
        for (Enterence enterence : enterences) {
            sum += enterence.getValue();
        }
        return sum;
    }
}

public class OrnamentalGarden {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new Enterence(i));
        }
        TimeUnit.SECONDS.sleep(3);
        Enterence.cancel();
        executorService.shutdown();
        if (!executorService.awaitTermination(250, TimeUnit.MILLISECONDS))
            System.out.println("Some takes were not terminated");
        System.out.println("Total: " + Enterence.getTotalCount());
        System.out.println("Sum of Enterances: " + Enterence.sumEnterances());
    }
}
