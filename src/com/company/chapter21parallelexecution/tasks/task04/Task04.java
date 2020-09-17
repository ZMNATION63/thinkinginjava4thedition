package com.company.chapter21parallelexecution.tasks.task04;

import com.company.chapter21parallelexecution.tasks.task02.Fibonacci;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 4. ( 1) Повторите упражнение 2 с разными типами Executor, описанными в этом разделе.
 */
public class Task04 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++) {
            executorService.execute(new Fibonacci(18));
        }
        executorService.shutdown();
    }
}
