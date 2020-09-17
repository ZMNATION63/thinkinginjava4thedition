package com.company.chapter21parallelexecution.examples.ex026closeresource;

import java.io.IOException;
import java.io.InputStream;

class IOBlocked implements Runnable {
    private InputStream in;

    public IOBlocked(InputStream in) {
        this.in = in;
    }

    @Override
    public void run() {
        try {
            System.out.println("Waiting for read: ");
            in.read();
        } catch (IOException e) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Interrupted from block I/O");
            } else {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting IOBlocked.run()");
    }
}