package com.company.chapter21parallelexecution.tasks.task09;

public class SimplePriorities implements Runnable {
    private int countDown = 5;
    private volatile double d;
    private int priority;

    public String toString() {
        return "Приоритет " + Thread.currentThread().getPriority() + " Имя текущего потока "
                + Thread.currentThread().getName() + " Обратный отсчет " + " : " + countDown;
    }

    @Override
    public void run() {
//        Thread.currentThread().setPriority(priority);
        while (true) {
            for (int i = 0; i < 100000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0)
                    Thread.yield();
            }
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }
}
