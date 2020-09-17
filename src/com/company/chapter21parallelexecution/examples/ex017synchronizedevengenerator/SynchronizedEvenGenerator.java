package com.company.chapter21parallelexecution.examples.ex017synchronizedevengenerator;

import com.company.chapter21parallelexecution.examples.ex016intgenerator.EvenChecker;
import com.company.chapter21parallelexecution.examples.ex016intgenerator.IntGenerator;

/**
 *
 */
public class SynchronizedEvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenerator());
    }
}
