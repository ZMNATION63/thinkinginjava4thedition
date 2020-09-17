package com.company.chapter21parallelexecution.tasks.task09;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * 9. (3) Измените пример SimplePriorities.java, чтобы пользовательская реализация ThreadFactory задавала приоритеты потоков.
 * <p>
 * Класс RunableTask задает случайным образом приоритет потоку
 * Возвращает поток с этим приоритетом
 */
public class RunableTask implements ThreadFactory {
    Random randomPriority = new Random(3);

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        int i = randomPriority.nextInt(3);
        switch (i) {
            case 0:
                thread.setPriority(Thread.MIN_PRIORITY);
                break;
            case 1:
                thread.setPriority(Thread.NORM_PRIORITY);
                break;
            case 2:
                thread.setPriority(Thread.MAX_PRIORITY);
                break;
        }
        return thread;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool(new RunableTask());

        for (int i = 0; i < 3; i++)
            executorService.execute(new SimplePriorities());

        executorService.execute(new SimplePriorities());
        executorService.shutdown();
    }
}
