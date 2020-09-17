package com.company.chapter21parallelexecution.examples.ex038CountDownLatchDemo;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Выполнение части общей задачи:
 */
class TaskPortion implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private static Random random = new Random(47);
    private final CountDownLatch latch;

    public TaskPortion(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            doWork();
            latch.countDown();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    public void doWork() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(random.nextInt(2000));
        System.out.println(this + " completed");
    }

    public String toString() {
        return String.format("%1$-3d", id);
    }
}

class WaittingTask implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private final CountDownLatch latch;

    public WaittingTask(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            latch.await();
            System.out.println("Latch barrier passed for " + this);
        } catch (InterruptedException e) {
            System.out.println(this + " interrupted");
        }
    }

    public String toString() {
        return String.format("WaitingTask %1$-3d ", id);
    }
}

public class CountDownLatchDemo {
    static final int SIZE = 100;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //ВСе должны совместно использовать один объект  CountDownLatch
        CountDownLatch latch = new CountDownLatch(SIZE);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new WaittingTask(latch));
        }
        for (int i = 0; i < SIZE; i++) {
            executorService.execute(new TaskPortion(latch));
        }
        System.out.println("Lauched all tasks");
        executorService.shutdownNow();
    }
}
