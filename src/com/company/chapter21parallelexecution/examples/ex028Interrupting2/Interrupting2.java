package com.company.chapter21parallelexecution.examples.ex028Interrupting2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Как упоминалось ранее при обсуждении непрерываемого ввода-вывода, любая ситуация, в
 * которой задача может быть заблокирована без возможности прерывания, может
 * парализовать работу программы. Одним из новшеств библиотеки^уа SE5 concurrency
 * стала возможность прерывания задач, заблокированных по R e e n t r a n t L o c k , — в отличие
 * от задач, заблокированных по синхронизированным методам или критическим секциям
 */
class BlockedMutex {
    private Lock lock = new ReentrantLock();

    public BlockedMutex() {
        // Немедленное получение блокировки для демонстрации
        // прерывания з а д а ч л заблокированных по R e e n tr a n tL o c k :
        lock.lock();
    }

    public void f() {
        //Никогда не будет доступен для второй задачи
        try {
            lock.lockInterruptibly();
            System.out.println("Lock acquired in f()");
        } catch (InterruptedException e) {
            System.out.println("Interrupted from lock acquisition in f()");
        }
    }
}

class Blocked2 implements Runnable {
    BlockedMutex block = new BlockedMutex();

    @Override
    public void run() {
        System.out.println("Waiting for f() in BlockrdMutex");
        block.f();
    }
}

public class Interrupting2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Blocked2());
        t.start();
        TimeUnit.SECONDS.sleep(3);
        //пытаемся вызвать метод interrupted а натыкаемся на исклчение
        t.interrupt();
    }
}

