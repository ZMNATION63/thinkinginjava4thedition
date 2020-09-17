package com.company.chapter21parallelexecution.tasks.task015;

/**
 * TODO: так и не разобрался по какйо такой причине не выводятся одинаковые методы под ряд, почему они перескакивают
 * <p>
 * 15. (1) Создайте класс с тремя методами, содержащими критические секции, синхронизируемые по одному объекту.
 * Создайте несколько задач, демонстрирующих, что
 * в любой момент времени может выполняться только один из этих методов. Теперь
 * измените методы, чтобы каждый из них синхронизировался по своему объекту,
 * и покажите, что все методы могут выполняться одновременно.
 */
class MySync {
    Object syncA = new Object();
    Object syncB = new Object();
    Object syncC = new Object();

    public void f() {
        synchronized (syncA) {
            for (int i = 0; i < 5; i++) {
                System.out.println("f() " + i + " syncA");
                Thread.yield();
            }
        }
    }

    public void g() {
        synchronized (syncB) {
            for (int i = 0; i < 5; i++) {
                System.out.println("g() " + i + " syncB");
                Thread.yield();
            }
        }
    }

    public void h() {
        synchronized (syncC) {
            for (int i = 0; i < 5; i++) {
                System.out.println("h() " + i + " syncC");
                Thread.yield();
            }
        }
    }
}

public class Task015 {
    public static void main(String[] args) {
        MySync mySync = new MySync();
        for (int i = 0; i < 5; i++) {
            new Thread() {
                public void run() {
                    mySync.f();
                }
            }.start();
            new Thread() {
                @Override
                public void run() {
                    mySync.g();
                }
            }.start();
            new Thread() {
                @Override
                public void run() {
                    mySync.h();
                }
            }.start();
        }
    }
}
