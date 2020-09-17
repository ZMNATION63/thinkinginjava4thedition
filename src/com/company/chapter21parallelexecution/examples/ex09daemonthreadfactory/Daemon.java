package com.company.chapter21parallelexecution.examples.ex09daemonthreadfactory;

import java.util.concurrent.TimeUnit;

/**
 * Как узнать, что поток демон
 * isDeamon()
 * Поток класса Daemon переводится в режим демона, а затем порождает связку новых потоков (для которых флагдемона
 * явно не устанавливается), чтобы показать, что они все равно будут демонами. Затем поток переходит
 * в бесконечный цикл, на каждом шаге которого вызывается метод yield(), передающий управление другому процессу.
 * Учтите, что потоки-демоны завершают свои методы run() без выполнения блока finally:
 */
public class Daemon implements Runnable {
    private Thread[] t = new Thread[10];

    @Override
    public void run() {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DaemonSpaw());
            t[i].start();
            System.out.println("DaemonSpaw " + i + " started, ");

        }

        for (int i = 0; i < t.length; i++) {
            System.out.println("t[ " + i + " ].isDaemon() = " + t[i].isDaemon() + ", ");
        }
        while (true) {
            Thread.yield();
        }
    }

    class DaemonSpaw implements Runnable {
        @Override
        public void run() {
            while (true)
                Thread.yield();
        }
    }

    public static class Daemons {
        public static void main(String[] args) throws InterruptedException {
            Thread d = new Thread(new Daemon());
            d.setDaemon(true);
            d.start();
            System.out.println("d.isDaemon = " + d.isDaemon() + ", ");
            /**
             * как обычно ждем потоки демоны дял завершения процессов
             */
            TimeUnit.MILLISECONDS.sleep(10);
        }
    }
}
