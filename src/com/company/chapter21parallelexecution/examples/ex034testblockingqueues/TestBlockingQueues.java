package com.company.chapter21parallelexecution.examples.ex034testblockingqueues;


import com.company.chapter21parallelexecution.examples.ex01liftoff.LiftOff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 *
 */
class LiftOffRunner implements Runnable {
    private BlockingDeque<LiftOff> rockets;

    public LiftOffRunner(BlockingQueue<LiftOff> queue) {
        this.rockets = rockets;
    }

    public void add(LiftOff lo) {
        try {
            rockets.put(lo);
        } catch (InterruptedException e) {
            System.out.println("Interrupted during put()");
        }
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                LiftOff rocket = rockets.take();
                rocket.run();
            }
        } catch (InterruptedException e) {
            System.out.println("Waking from take()");
        }
    }
}

public class TestBlockingQueues {
    static void getkey() {
        try {
            // Компенсация различий Windows/Linux в длине результатал
            // производимого клавишей Enter:
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void getkey(String message) {
        System.out.print(message);
        getkey();
    }

    static void test(String msg, BlockingQueue<LiftOff> queue) {
        System.out.println(msg);
        LiftOffRunner runner = new LiftOffRunner(queue);
        Thread t = new Thread(runner);
        t.start();
        for (int i = 0; i < 5; i++) {
            runner.add(new LiftOff(5));
        }
        getkey("Press 'Enter' (" + msg + ")");
        t.interrupt();
        System.out.println("Finished " + msg + " test");
    }

    public static void main(String[] args) {
//        test("LinkedBlockingQuwue", new LinkedBlockingQueue<LiftOff>());
//        test("ArrayBlockingQuwue", new ArrayBlockingQueue<LiftOff>(3));
//        test("SynchronousQueue", new SynchronousQueue<LiftOff>());
    }
}
