package com.company.chapter21parallelexecution.tasks.task014;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * 14. (4) Продемонстрируйте масштабируемость кода java.util.Timer — создайте программу,
 * которая генерирует множество объектов Timer, выполняющих какую-нибудь простую операцию по тайм-ауту.
 */
public class Task014 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 20000; i++) {
            Timer t = new Timer();
            t.schedule(new TimerTask() {
                public void run() {
                    System.out.println(System.nanoTime());
                }
            }, 1000 + rand.nextInt(5000));
        }
        try {
            TimeUnit.MILLISECONDS.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
