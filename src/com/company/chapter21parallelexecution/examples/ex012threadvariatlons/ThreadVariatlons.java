package com.company.chapter21parallelexecution.examples.ex012threadvariatlons;

import java.util.concurrent.TimeUnit;

/**
 * Создание потоков во внутреннем классе
 * Использование внутреннего именованного класса
 */
class InnerThread1 {
    private int countDown = 5;
    private Inner inner;

    private class Inner extends Thread {
        Inner(String name) {
            super(name);
            start();
            /**
             *не самая лучшая идея. так как может произойти конфликт выполнения,
             *тк в момент создания потока другая задача может начать выполнение
             * Лучше всего создавать потоки через Executor
             */
        }

        public void run() {
            try {
                while (true) {
                    System.out.println(this);
                    if (--countDown == 0) return;
                    sleep(10);
                }
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        }

        public String toString() {
            return getName() + " " + countDown;
        }
    }

    public InnerThread1(String name) {
        inner = new Inner(name);
    }
}

class InnerThread2 {
    private int countDown = 5;
    private Thread t;

    public InnerThread2(String name) {
        t = new Thread(name) {
            public void run() {
                try {
                    while (true) {
                        System.out.println(this);
                        if (--countDown == 0) return;
                        sleep(10);
                    }
                } catch (InterruptedException e) {
                    System.out.println("sleep() interrupted ");
                }

            }

            public String toString() {
                return getName() + ": " + countDown;
            }
        };
        t.start();
    }
}

/**
 * Использование именованой реализации Runnable
 */
class InnerRunnablel {
    private int countDown = 5;
    private Inner inner;

    private class Inner implements Runnable {
        Thread t;

        Inner(String name) {
            t = new Thread(this, name);
            t.start();
        }

        public void run() {
            try {
                while (true) {
                    System.out.println(this);
                    if (--countDown == 0) return;
                    TimeUnit.MILLISECONDS.sleep(10);
                }
            } catch (InterruptedException e) {
                System.out.println("sleep() interrupted");
            }
        }

        @Override
        public String toString() {
            return t.getName() + countDown;
        }
    }

    public InnerRunnablel(String name) {
        inner = new Inner(name);
    }
}

class InnerRunnable2 {
    private int countDown = 5;
    private Thread t;

    public InnerRunnable2(String name) {
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(this);
                    if (--countDown == 0) return;
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("sleep() interrupted");
                }
            }

            public String toString() {
                return Thread.currentThread().getName() + ": " + countDown;
            }
        }, name);
    }
}

class ThreadMethod {
    private int countDown = 5;
    private Thread t;
    private String name;

    public ThreadMethod(String name) {
        this.name = name;
    }

    public void runTask() {
        if (t == null) {
            t = new Thread(name) {
                public void run() {
                    try {
                        System.out.println(this);
                        if (--countDown == 0) return;
                        sleep(10);
                    } catch (InterruptedException e) {
                        System.out.println("sllep() interrupted");
                    }
                }

                public String toString() {
                    return getName() + ": " + countDown;
                }
            };
            t.start();
        }
    }
}

public class ThreadVariatlons {
    public static void main(String[] args) {
        new InnerThread1("InnerThread1");
        new InnerThread2("InnerThread2");
        new InnerRunnablel("InnerRunnablel");
        new InnerRunnable2("InnerRunnable2");
        new ThreadMethod("ThreadMethod").runTask();

    }
}
