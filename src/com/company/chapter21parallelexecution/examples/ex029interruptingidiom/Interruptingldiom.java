package com.company.chapter21parallelexecution.examples.ex029interruptingidiom;

import java.util.concurrent.TimeUnit;

/**
 * Общая идиома прерывания задачи
 */
class NeedsCleanup {
    private final int id;

    public NeedsCleanup(int id) {
        this.id = id;
    }

    public void cleanup() {
        System.out.println("Cleaning ID " + id);
    }
}

class Blocked3 implements Runnable {
    private volatile double d = 0.0;

    public void run() {
        try {
            while (!Thread.interrupted()) {
                //точка1
                NeedsCleanup n1 = new NeedsCleanup(1);
                //try-finallyначинаетсясразужезаопределением
                //nl,чтобыгарантироватьосвобождениеnl:
                try {
                    System.out.println("Sleeping");
                    TimeUnit.SECONDS.sleep(1);
                    //точка2
                    NeedsCleanup n2 = new NeedsCleanup(2);
                    //Гарантируетправильноеосвобождениеn2:
                    try {
                        System.out.println("Calculating");
                        //Продолжительнаянеблокирующаяоперация:
                        for (int i = 1; i < 2500000; i++)
                            d = d + (Math.PI + Math.E) / d;
                        System.out.println("Finishedtime-consumingoperation");
                    } finally {
                        n2.cleanup();
                    }
                } finally {
                    n1.cleanup();
                }
            }
            System.out.println("Exitingviawhile()test");
        } catch (InterruptedException e) {
            System.out.println("ExitingviaInterruptedException");
        }
    }
}

public class Interruptingldiom {
    public static void main(String[] args) throws InterruptedException {
        if (args.length != 1) {
            System.out.println("Usage: java interruptingIdiom delay-in-mS");
            System.exit(1);
        }
        Thread t = new Thread(new Blocked3());
        t.start();
        TimeUnit.MILLISECONDS.sleep(new Integer(args[0]));
        t.interrupt();
        t.interrupt();
    }
}
