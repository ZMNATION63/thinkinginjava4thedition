package com.company.chapter21parallelexecution.examples.ex037chopstick;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Итак, потоки способны перейти в блокированное состояние, а объекты могут обладать
 * синхронизированными методами, которые запрещают использование объекта до тех
 * пор, пока не будет снята блокировка. Вероятна ситуация, в которой один поток ожидает
 * другой поток, тот, в свою очередь, ждет освобождения еще одного потока и так далее,
 * пока эта цепочка не замыкается на поток, который ожидает освобождения первого потока.
 * Получается замкнутый круг потоков, которые дожидаются освобождения друг
 * друга и никто не может двинуться первым. Такая ситуация называется тупиком, или
 * взаимной блокировкой (deadlock).
 */
public class Chopstick {
    private boolean taken = false;

    public synchronized void take() throws InterruptedException {
        while (taken)
            wait();
        taken = true;
    }

    public synchronized void drop() {
        taken = false;
        notifyAll();
    }
}

class Philosopher implements Runnable {
    private Chopstick left;
    private Chopstick right;
    private final int id;
    private final int ponderFactor;
    private Random random = new Random(47);

    private void pause() throws InterruptedException {
        if (ponderFactor == 0) return;
        TimeUnit.MILLISECONDS.sleep(ponderFactor * 250);
    }

    public Philosopher(Chopstick left, Chopstick right, int id, int ponderFactor) {
        this.left = left;
        this.right = right;
        this.id = id;
        this.ponderFactor = ponderFactor;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println(this + " thinking");
                pause();
                System.out.println(this + " gradding right");
                right.take();
                System.out.println(this + " gradding left");
                left.take();
                System.out.println(this + " eating");
                pause();
                right.drop();
                left.drop();
            }
        } catch (InterruptedException e) {
            System.out.println(this + " exiting via interrupt");
        }
    }

    @Override
    public String toString() {
        return "Philosopher " + id;
    }
}
