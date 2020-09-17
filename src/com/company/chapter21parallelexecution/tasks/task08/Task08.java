package com.company.chapter21parallelexecution.tasks.task08;

import com.company.chapter21parallelexecution.examples.ex01liftoff.LiftOff;

/**
 * 8. (1) Измените пример MoreBasicThreads.java так, чтобы все потоки выполнялись в режиме демона. Убедитесь в том,
 * что программа завершается сразу же после выхода из main().
 */
public class Task08 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new LiftOff());
            thread.setDaemon(true);
            thread.start();
            System.out.println("Ожидаем вывод ListOff");
        }
    }
}
