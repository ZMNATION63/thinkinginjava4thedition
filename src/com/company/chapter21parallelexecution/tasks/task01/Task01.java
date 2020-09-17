package com.company.chapter21parallelexecution.tasks.task01;

/**
 * 1. (2) Реализуйте интерфейс Runnable. В методе run() выведите сообщение, после чего
 * BH30BH Teyield(). Повторитетри разаиверните управление из run(). Выведите начальное сообщение
 * в конструкторе, а при завершении выведите конечное сообщение.
 * Создайте несколько задач и организуйте их выполнение с использованием потоков.
 */
public class Task01 implements Runnable {
    public static void main(String[] args) {
//        Thread thread = new Thread(new Task01());

        System.out.println(new Throwable().getStackTrace()[0].getMethodName() + " начальное сообщение метода");
        for (int i = 0; i < 3; i++) {
            new Thread(new Task01()).start();
        }
        System.out.println(new Throwable().getStackTrace()[0].getMethodName() + " конечное сообщение метода");
    }

    @Override
    public void run() {
        System.out.println("Начальное сообщение ");
        Thread.yield();
        System.out.println("Конечное сообщение сообщение ");
        System.out.println("------------------------------");
    }
}
