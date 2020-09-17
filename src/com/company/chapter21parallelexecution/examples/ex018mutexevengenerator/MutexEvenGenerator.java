package com.company.chapter21parallelexecution.examples.ex018mutexevengenerator;


import com.company.chapter21parallelexecution.examples.ex016intgenerator.EvenChecker;
import com.company.chapter21parallelexecution.examples.ex016intgenerator.IntGenerator;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * предотвращение конфликта между потоками при помощи мьютекса
 */
public class MutexEvenGenerator extends IntGenerator {
    private int currentEventGenerator = 0;
    private Lock lock = new ReentrantLock();

    @Override
    public int next() {
        lock.lock();
        try {
            ++currentEventGenerator;
            Thread.yield();
            ++currentEventGenerator;
            return currentEventGenerator;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        EvenChecker.test(new MutexEvenGenerator());
    }
}
