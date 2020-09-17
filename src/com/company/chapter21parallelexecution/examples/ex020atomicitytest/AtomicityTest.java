package com.company.chapter21parallelexecution.examples.ex020atomicitytest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 12. (3) Исправьте ошибку в AtomicityTest.java, используя ключевое слово synchronized.
 * Сможете ли вы продемонстрировать, что теперь программа работает верно
 * <p>
 * Тем не менее программа обнаружит нечетные значения и завершится. Хотя return i является атомарной операцией,
 * отсутствие синхронизации позволяет прочитать объект в нестабильном промежуточном состоянии.
 * Вдобавок, поскольку переменная i тоже объявлена без volatile, могут возникнуть проблемы с видимостью.
 * Оба метода, getValue() и evenlncrement(), должны быть синхронизированы.
 */
public class AtomicityTest implements Runnable {
    private int i = 0;

    public synchronized int getValue() {
        return i;
    }

    private synchronized void evenIncrement() {
        i++;
        i++;
    }

    @Override
    public void run() {
        while (true)
            evenIncrement();
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        AtomicityTest at = new AtomicityTest();
        executorService.execute(at);
        while (true) {
            int val = at.getValue();
            if (val % 2 != 0) {
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
