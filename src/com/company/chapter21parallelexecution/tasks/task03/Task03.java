package com.company.chapter21parallelexecution.tasks.task03;


import com.company.chapter21parallelexecution.tasks.task01.Task01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 3. ( 1) Повторите упражнение 1 с разными типами Executor, описанными в этом разделе
 */
public class Task03 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.execute(new Task01());
        }
        executorService.shutdown();
    }
}
