package com.company.chapter21parallelexecution.examples.ex019attemptlocking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * В общем случае ключевое слово synchronized уменьшает объем кода и снижает вероятность ошибок пользователя,
 * так что объекты Lock обычно применяются только в особых ситуациях. Например, с ключевым словом synchronized
 * невозможно обработать неудачную попытку получения блокировки или прервать попытки получения блокировки после
 * истечения заданного промежутка времени — в таких случаях необходимо использовать библиотеку concurrent
 */
public class AttemptLocking {
    private ReentrantLock lock = new ReentrantLock();

    public void untimed() {
        boolean captured = lock.tryLock();
        try {
            System.out.println("tryLock(): " + captured);
        } finally {
            if (captured)
                lock.unlock();
        }
    }

    public void timed() {
        boolean captured = false;
        try {
            captured = lock.tryLock(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("tryLock(2, TimeUnit.SECONDS) " + captured);
        } finally {
            if (captured) lock.unlock();
        }
    }

    public static void main(String[] args) {
        final AttemptLocking al = new AttemptLocking();
        al.untimed();//блокировка доступа
        al.timed();//блокировка доступа
        /**
         * создаем отдельную задачу для блокироваки доступа
         */
        new Thread() {
            {
                setDaemon(true);
            }

            public void run() {
                al.lock.lock();
                System.out.println("ac");
            }
        }.start();
        Thread.yield();
        al.untimed();
        al.timed();
    }
}
