package com.company.chapter21parallelexecution.tasks.task011;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 11. (3) Создайте класс с двумя полями данных и методом, который работает с этими полями в несколько этапов,
 * чтобы во время выполнения метода поля находились в «некорректном состоянии»
 * (по тому определению, которое вы установите). Добавьте методы чтения полей; создайте несколько потоков,
 * в которых эти методы будут вызываться, и покажите, что данные находятся в некорректном состоянии.
 * Решите проблему при помощи ключевого слова synchronized.
 */
public class MyData implements Runnable {
    /**
     * поля должны быть приватными и к ним должны быть  synchronized
     * геттеры и сеттеры
     */
    private String a;
    private String b;

    /**
     * Ставим метку на поля класса, что они используются в данный момент
     * ни один из потоков больше не сможет получить доступ к данным
     */
    public synchronized void manyIterrationMethod() {
        for (int i = 0; i < 10000; i++) {
            a = " Loading A = 10000 times";
            b = " Loading b = 10000 times";
        }
        a = "Correct satase A";
        b = "Correct satase B";
    }

    public MyData() {
        a = "Correct satase A";
        b = "Correct satase B";
    }

    public synchronized String getA() {
        return a;
    }

    public synchronized String getB() {
        return b;
    }

    public void run() {
        manyIterrationMethod();
        System.out.println("Field A = " + getA());
        System.out.println("Field B = " + getB());
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        MyData myData = new MyData();
        for (int i = 0; i < 10; i++) {
            executorService.execute(myData);
        }
    }
}
