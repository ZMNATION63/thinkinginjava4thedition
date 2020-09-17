package com.company.chapter21parallelexecution.tasks.task06;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 6. (2) Создайте задачу, которая приостанавливается на случайный промежуток времени
 * от 1 до 10 секунд, затем выводит время ожидания и завершается.
 * Создайте и запустите несколько таких задач (количество должно задаваться в командной строке)
 */
public class SleepTeam implements Runnable {
    private int maxSleep = 10000;
    private Random random = new Random(maxSleep);
    private final int id = count++;
    private static int count = 0;
    private int sleep = 0;

    private String status() {
        this.sleep = random.nextInt(maxSleep);
        return "ID процесса " + id + " Процесс спал " + sleep + " милиcекунд";
    }

    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(this.sleep);
            System.out.println(status());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new SleepTeam());
        }
        executorService.shutdown();
    }
}
