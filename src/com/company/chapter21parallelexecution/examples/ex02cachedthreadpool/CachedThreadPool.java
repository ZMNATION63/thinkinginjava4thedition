package com.company.chapter21parallelexecution.examples.ex02cachedthreadpool;



import com.company.chapter21parallelexecution.examples.ex01liftoff.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Объекты Executor, появившиеся Bjava SE5 (java.util.concurrent), значительно упрощают
 * параллельное программирование и управляют объектами Thread за разработчиком.
 * Они образует дополнительную логическую прослойку между клиентом и исполняемой задачей;
 * вместо того чтобы запускать задачу напрямую, клиент поручает это промежуточному объекту.
 * Объект Executor позволяет управлять выполнением асинхронных задач без явного управления жизненным
 * циклом потоков; этот механизм рекомендуется применять для выполнения задач Bjava SE5/6.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
