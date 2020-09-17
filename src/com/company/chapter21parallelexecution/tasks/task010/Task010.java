package com.company.chapter21parallelexecution.tasks.task010;


import com.company.chapter21parallelexecution.tasks.task02.Fibonacci;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 10. (4) Измените упражнение 5 по образцу класса ThreadMethod, чтобы метод runTask()
 * получал аргумент с количеством суммируемых чисел Фибоначчи и при каждом вызове runTask()
 * возвращал объект Future, полученный при вызове submit().
 */
public class Task010 {
    static class ThreadMethod {
        private int countDown = 5;
        private Thread t;
        private String name;

        public ThreadMethod(String name) {
            this.name = name;
        }

        public void runTask() {
            if (t == null) {
                t = new Thread(name) {
                    @Override
                    public void run() {
                        ExecutorService threadFactory = Executors.newCachedThreadPool();
                        threadFactory.submit(new Fibonacci(18));
//                        threadFactory.submit(new Fibonacci(3));
                        System.out.println("ID потока " + t.getId() + " Имя потока " + t.getName());
                    }
                };
                t.start();
            }
        }
    }

    public static void main(String[] args) {

        new ThreadMethod("aawd").runTask();
    }

}
