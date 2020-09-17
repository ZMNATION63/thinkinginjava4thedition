package com.company.chapter21parallelexecution.tasks.task07;

import java.util.concurrent.TimeUnit;

public class TestFinally implements Runnable {
    @Override
    public void run() {
        System.out.println("Starting as ADaemon!!!");
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println("TRY");
        } catch (InterruptedException e) {
            System.out.println("Exiting via InterruptedException");
        } finally {
            System.out.println("This should always run?");
        }
    }
}
