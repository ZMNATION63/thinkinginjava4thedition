package com.company.chapter21parallelexecution.examples.ex037chopstick;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixetfDiningPhilosophers {
    public static void main(String[] args) throws InterruptedException {
        int ponder = 5;
        if (args.length > 0)
            ponder = Integer.parseInt(args[0]);
        int size = 5;
        if (args.length > 1)
            size = Integer.parseInt(args[1]);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Chopstick[] chopsticks = new Chopstick[size];
        for (int i = 0; i < size; i++) {
            chopsticks[i] = new Chopstick();
        }
        for (int i = 0; i < size; i++) {
            if (i < (size - 1)) {
                executorService.execute(new Philosopher(
                        chopsticks[i], chopsticks[i + 1], i, ponder));
            } else {
                executorService.execute(new Philosopher(
                        chopsticks[0], chopsticks[i], i, ponder));
            }
        }
        if (args.length == 3 && args[2].equals("timeout"))
            TimeUnit.SECONDS.sleep(5);
        else {
            System.out.println("Press 'Enter' to quit");
        }
        executorService.shutdownNow();
    }
}
