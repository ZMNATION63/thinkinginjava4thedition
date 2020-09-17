package com.company.chapter21parallelexecution.examples.ex09daemonthreadfactory;

import java.util.concurrent.TimeUnit;

/**
 * В демонах нет блока finally
 */
public class ADaemon implements Runnable {
    @Override
    public void run() {
        System.out.println("Starting as ADaemon!!!");
        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Exiting via InterruptedException");
        } finally {
            System.out.println("This should always run?");
        }
    }
}
