package com.company.chapter21parallelexecution.examples.ex022atomicIntegertest;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest implements Runnable {
    private AtomicInteger i = new AtomicInteger(0);

    public int getValue() {
        return i.get();
    }

    private void eventIncrement() {
        i.addAndGet(2);
    }

    @Override
    public void run() {
        while (true)
            eventIncrement();
    }

    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Aborting");
                System.exit(0);
            }
        }, 5000);
    }
}
