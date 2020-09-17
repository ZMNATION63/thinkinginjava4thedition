package com.company.chapter21parallelexecution.examples.ex050tester;


import com.company.chapter17containerdetails.examples.ex07countingIntegerlist.CountingIntegerList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * приблизительное сравнение производительности потоков-безопасных списков
 */
abstract class ListTest extends Tester<List<Integer>> {
    ListTest(String testId, int nReaders, int nWriters) {
        super(testId, nReaders, nWriters);
    }

    class Reader extends TestTask {
        long result = 0;

        void test() {
            for (int i = 0; i < testCycles; i++) {
                for (int index = 0; index < containerSize; index++) {
                    result += testContainer.get(index);
                }
            }
        }

        void putResults() {
            readResult += result;
            readTime += duration;
        }

        void startReadersAndWriters() {
            for (int i = 0; i < nReaders; i++) {
                executorService.execute(new Reader());
            }
            for (int i = 0; i < nWriters; i++) {
//                executorService.execute(new Writer());
            }
        }
    }

    static class SynchronizedArrayListTest extends ListTest {

        List<Integer> containerInitializer() {
            return Collections.synchronizedList(new ArrayList<Integer>(
                    new CountingIntegerList(containerSize)));
        }

        SynchronizedArrayListTest(int nReaders, int nWriters) {
            super("Synched ArrayList", nReaders, nWriters);
        }

        @Override
        List<Integer> conteinerInitializer() {
            return null;
        }

        @Override
        void startRedersAndWriters() {

        }
    }

    static class CopyOnWriteArrayListTest extends ListTest {
        List<Integer> containerInitializer() {
            return new CopyOnWriteArrayList<Integer>(new CountingIntegerList(containerSize));
        }

        CopyOnWriteArrayListTest(int nReaders, int nWriters) {
            super("CopyOnWriteArrayList", nReaders, nWriters);
        }

        @Override
        List<Integer> conteinerInitializer() {
            return null;
        }

        @Override
        void startRedersAndWriters() {

        }
    }

    public static class ListComparisons {
        public static void main(String[] args) {
//            Tester.initMain(args)
            new SynchronizedArrayListTest(10, 0);
            new SynchronizedArrayListTest(9, 1);
            new SynchronizedArrayListTest(5, 5);
            new CopyOnWriteArrayListTest(10, 0);
            new CopyOnWriteArrayListTest(9, 1);
            new CopyOnWriteArrayListTest(5, 5);
            Tester.exec.shutdown();
        }

    }
}



