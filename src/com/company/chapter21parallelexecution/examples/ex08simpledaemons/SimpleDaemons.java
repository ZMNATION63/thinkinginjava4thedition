package com.company.chapter21parallelexecution.examples.ex08simpledaemons;

import java.util.concurrent.TimeUnit;

/**
 * Поток-демон (daemon) предоставляет некоторые общие услуги в фоновом режиме, пока выполняется программа,
 * но не является ее неотъемлемой частью. Таким образом, когда все потоки не-демоны заканчивают свою деятельность,
 * программа завершается. И обратно, если существуют работающие потоки не-демоны, программа продолжает выполнение.
 * <p>
 * Есть ли у процесса демоны потоки или нет, если основной обычный поток, не демон, завершает работу
 * завершают работу и демононы.
 * <p>
 * В примере специально сделаны остановки, если этого не делать, то процесс не выведет резульатт работы демонов
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
            System.out.println(Thread.currentThread() + " " + this);
        } catch (InterruptedException e) {
            System.out.println("sleep() interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread deamon = new Thread(new SimpleDaemons());
            deamon.setDaemon(true); //необоходимо перед вызовом метода start()
            deamon.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
