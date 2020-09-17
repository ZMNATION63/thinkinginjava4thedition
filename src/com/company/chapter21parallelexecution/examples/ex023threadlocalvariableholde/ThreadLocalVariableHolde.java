package com.company.chapter21parallelexecution.examples.ex023threadlocalvariableholde;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Accesor implements Runnable {
    private final int id;

    public Accesor(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            ThreadLocalVariableHolde.increment();
            System.out.println(this);
            Thread.yield();
        }
    }

    @Override
    public String toString() {
        return "#" + id + ": " + ThreadLocalVariableHolde.get();
    }
}

public class ThreadLocalVariableHolde {
    private static ThreadLocal<Integer> value = new ThreadLocal<Integer>() {
        private Random random = new Random(47);

        protected synchronized Integer initialValue() {
            return random.nextInt(10000);
        }
    };

    public static void increment() {
        value.set(value.get() + 1);
    }

    public static int get() {
        return value.get();
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new Accesor(i));
        }
        TimeUnit.SECONDS.sleep(3);
        executorService.shutdown();
    }
}
