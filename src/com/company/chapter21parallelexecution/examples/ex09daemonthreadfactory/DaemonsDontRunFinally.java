package com.company.chapter21parallelexecution.examples.ex09daemonthreadfactory;


import java.util.concurrent.TimeUnit;

/**
 * Потоки демоны завершаются без выполнения блока в исключении Finally
 */
public class DaemonsDontRunFinally {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
        //Вопрос, почему выполняется блок finally при простое main
        TimeUnit.MILLISECONDS.sleep(10);
    }
}
