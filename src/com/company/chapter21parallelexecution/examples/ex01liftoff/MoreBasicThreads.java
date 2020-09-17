package com.company.chapter21parallelexecution.examples.ex01liftoff;

/**
 * Иллюстрация многопоточности
 * Запустили 5 разных потоков, со своим номером
 * Вывод показывате, что потоки выполняются в разное время и один уступает
 * процесорное время другому
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
            System.out.println("Ожидаем вывод ListOff");
        }
    }
}
