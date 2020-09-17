package com.company.chapter21parallelexecution.examples.ex049synchronizationcomparisons;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * сравнение произвоительности Lock и  Atomic
 * сс ключевым словом synchronized
 */

abstract class Accumulator {
    public static long cycles = 50000L;
    /**
     * Количество объектов Modifire и Reader в каждом тесте
     */
    private static final int N = 4;
    public static ExecutorService executorService = Executors.newFixedThreadPool(N * 2);
    private static CyclicBarrier barrier = new CyclicBarrier(N * 2 + 1);
    protected volatile int index = 0;
    protected volatile long value = 0;
    protected long duration = 0;
    protected String id = "error";
    protected final static int SIZE = 100000;
    protected static int[] preLoaded = new int[SIZE];

    static {
        /**
         * загрузка массива случайных чисел
         */
        Random random = new Random(47);
        for (int i = 0; i < SIZE; i++) {
            preLoaded[i] = random.nextInt();
        }
    }

    public abstract void accumulate();

    public abstract long read();

    private class Modifier implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < cycles; i++) {
                accumulate();
            }
            try {
                barrier.await();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private class Reader implements Runnable {
        private volatile long value;

        @Override
        public void run() {
            for (int i = 0; i < cycles; i++) {
                value = read();
            }
            try {
                barrier.await();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void timeTest() {
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            executorService.execute(new Modifier());
            executorService.execute(new Reader());
        }
        try {
            barrier.await();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        duration = System.nanoTime() - start;
        System.out.printf("%-13s: %13d\n", id, duration);
    }

    public static void report(Accumulator acc1, Accumulator acc2) {
        System.out.printf("%-22s: %.2f\n", acc1.id + "/" + acc2.id, (double) acc1.duration / (double) acc2.duration);
    }
}

class BaseLine extends Accumulator {
    {
        id = "BaseLine";
    }

    public void accumulate() {
        value += preLoaded[index++];
        if (index >= SIZE) index = 0;
    }

    public long read() {
        return value;
    }
}

class SynchronizedTest extends Accumulator {
    {
        id = "synchronized";
    }

    public synchronized void accumulate() {
        value += preLoaded[index++];
        if (index >= SIZE) index = 0;
    }

    public synchronized long read() {
        return value;
    }

}

class LockTest extends Accumulator {
    {
        id = "Lock";
    }

    private Lock lock = new ReentrantLock();

    public void accumulate() {
        lock.lock();
        try {
            value += preLoaded[index++];
            if (index >= SIZE) index = 0;
        } finally {
            lock.unlock();
        }
    }

    public long read() {
        lock.lock();
        try {
            return value;
        } finally {
            lock.unlock();
        }
    }
}

class AtomicTest extends Accumulator {
    {
        id = "Atomic";
    }

    private AtomicInteger index = new AtomicInteger(0);
    private AtomicLong value = new AtomicLong(0);

    public void accumulate() {
        /**
         * Решение не может использовать сразу несколько
         * объектов Atomic Тем не менее оно дает
         * пердставление о производительности
         */
        int i = index.getAndIncrement();
        value.getAndAdd(preLoaded[i]);
        if (++i >= SIZE)
            index.set(0);
    }

    public long read() {
        return value.get();
    }
}

public class SynchronizationComparisons {
    static BaseLine baseLine = new BaseLine();
    static SynchronizedTest synch = new SynchronizedTest();
    static LockTest lock = new LockTest();
    static AtomicTest atomic = new AtomicTest();

    static void test() {
        System.out.println("============================");
        System.out.printf("%-12s: %13d\n", "Cycles", Accumulator.cycles);
        baseLine.timeTest();
        synch.timeTest();
        lock.timeTest();
        atomic.timeTest();
        Accumulator.report(synch, baseLine);
        Accumulator.report(lock, baseLine);
        Accumulator.report(atomic, baseLine);
        Accumulator.report(synch, lock);
        Accumulator.report(synch, atomic);
        Accumulator.report(lock, atomic);
    }

    public static void main(String[] args) {
        /**
         * по умолчанию задаем количество посторений
         */
        int iterations = 5;
        /**
         * возможность изменения пвторений
         */
        if (args.length > 0)
            iterations = new Integer(args[0]);
        System.out.println("Warmap");
        baseLine.timeTest();
        /**
         * Теперь исходный тест не включает затраты
         * на первый запуск потоков
         * Создание множественных элементов данных
         */
        for (int i = 0; i < iterations; i++) {
            test();
            Accumulator.executorService.shutdownNow();
        }
    }
}
