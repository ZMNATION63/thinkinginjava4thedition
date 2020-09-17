package com.company.chapter21parallelexecution.examples.ex022atomicIntegertest;


import com.company.chapter21parallelexecution.examples.ex016intgenerator.EvenChecker;
import com.company.chapter21parallelexecution.examples.ex016intgenerator.IntGenerator;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEvenGenerator extends IntGenerator {
    private AtomicInteger currentEvenvalue = new AtomicInteger(0);

    public int next() {
        return currentEvenvalue.addAndGet(2);
    }

    public static void main(String[] args) {
        EvenChecker.test(new AtomicEvenGenerator());
    }
}
