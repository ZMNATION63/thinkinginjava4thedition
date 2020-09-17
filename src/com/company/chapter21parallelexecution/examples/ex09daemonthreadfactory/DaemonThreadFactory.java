package com.company.chapter21parallelexecution.examples.ex09daemonthreadfactory;

import java.util.concurrent.ThreadFactory;

/**
 * Режим демона включается методом setDaemon() перед запуском потока.
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread();
        t.setDaemon(true);
        return t;
    }
}
