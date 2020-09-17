package com.company.chapter21parallelexecution.tasks.task07;

import java.util.concurrent.TimeUnit;

/**
 * 7. (2) Поэкспериментируйте с разным временем ожидания в Daemons.java и посмотрите, что при этом происходит.
 */
public class DaemonNoFinally {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new TestFinally());
        t.setDaemon(true);
        t.start();
        TimeUnit.MILLISECONDS.sleep(100);
//        t.run();
    }
}
