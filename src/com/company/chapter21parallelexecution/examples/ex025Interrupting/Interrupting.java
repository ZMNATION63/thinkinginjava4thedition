package com.company.chapter21parallelexecution.examples.ex025Interrupting;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * прерывание заблокированного потока
 */
class SleepBlocked implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.MICROSECONDS.sleep(3);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception");
        }
        System.out.println("Exiting SllepBlocked.run();");
    }
}

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

class SynchronizedBlocked implements Runnable {
    public void f() {
        while (true) {
            Thread.yield();
        }
    }

    public SynchronizedBlocked() {
        new Thread() {
            @Override
            public void run() {
                f();
            }
        }.start();

    }

    @Override
    public void run() {
        System.out.println("Trying to call f() ");
        f();
        System.out.println("Exiting SyncronizedBlocked.run()");
    }
}

public class Interrupting {
    private static ExecutorService executorService = Executors.newCachedThreadPool();

    static void test(Runnable r) throws InterruptedException {
        Future<?> f = executorService.submit(r);
        TimeUnit.MICROSECONDS.sleep(100);
        System.out.println("Interrupting " + r.getClass().getName());
        f.cancel(true);
        System.out.println("Interrupt sent to" + r.getClass().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        test(new SleepBlocked());
        test(new IOBlocked(System.in));
        test(new SynchronizedBlocked());
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Aborting with Syste.exit(0)");
        System.exit(0);
    }
}
