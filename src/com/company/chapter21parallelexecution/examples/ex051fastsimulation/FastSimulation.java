package com.company.chapter21parallelexecution.examples.ex051fastsimulation;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FastSimulation {
    static final int N_ELEMENTS = 100000;
    static final int N_GENES = 30;
    static final int N_EVOLVERS = 50;
    static final int[][] GRID = new int[N_ELEMENTS][N_GENES];
    static Random rand = new Random();

    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < N_ELEMENTS; i++)
            for (int j = 0; j < N_GENES; j++) {
                GRID[i][j] = rand.nextInt(1000);
            }
        for (int i = 0; i < N_EVOLVERS; i++) {
            exec.execute(new Evolver());
        }
        TimeUnit.SECONDS.sleep(5);
        exec.shutdownNow();
    }

    static synchronized int getValue(int i, int j) {
        return GRID[i][j];
    }

    static synchronized void setValue(int i, int j, int newValue) {
        GRID[i][j] = newValue;
    }

    static class Evolver implements Runnable {
        public void run() {
            while (!Thread.interrupted()) {
                int element = rand.nextInt(N_ELEMENTS);
                for (int i = 0; i < N_GENES; i++) {
                    int previous = element - 1;
                    if (previous < 0) {
                        previous = N_ELEMENTS - 1;
                    }
                    int next = element + 1;
                    if (next >= N_ELEMENTS) {
                        next = 0;
                    }
                    int oldValue = getValue(element, i);
                    int newValue = oldValue + getValue(previous, i) + getValue(next, i);
                    newValue /= 3;
                    setValue(element, i, newValue);
                    System.out.println("Old value changed from " + oldValue);
                }
            }
        }
    }
}