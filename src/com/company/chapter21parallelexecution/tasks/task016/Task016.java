package com.company.chapter21parallelexecution.tasks.task016;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock ставится на выполнение задания,
 * до тех пор пока лок не отменен другой процесс
 * не может завладеть процессорным временем
 */
class MySync1 {
    Object syncA = new Object();
    Object syncB = new Object();
    Object syncC = new Object();
    Lock lock = new ReentrantLock();

    public void f() {
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("f()");
                Thread.yield();
            }
        } finally {
            lock.unlock();
        }
    }

    public void g() {
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("g()");
                Thread.yield();
            }
        } finally {
            lock.unlock();
        }
    }

    public void h() {
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("h()");
                Thread.yield();
            }
        } finally {
            lock.unlock();
        }

    }
}

public class Task016 {
    public static void main(String[] args) {
        MySync1 mySync = new MySync1();
        for (int i = 0; i < 5; i++) {
            new Thread() {
                public void run() {
                    mySync.f();
                }
            }.start();
            new Thread() {
                @Override
                public void run() {
                    mySync.g();
                }
            }.start();
            new Thread() {
                @Override
                public void run() {
                    mySync.h();
                }
            }.start();
        }
    }
}