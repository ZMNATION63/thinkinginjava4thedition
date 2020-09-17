package com.company.chapter21parallelexecution.examples.ex04singlethreadexecutor;


import com.company.chapter21parallelexecution.examples.ex01liftoff.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Объект SingleThreadExecutor работает как FixedThreadPool, использующий всего один
 * поток1. Он может пригодиться для любых продолжительных задач, выполняемых
 * в другом потоке, например задачи прослушивания входящих подключений через
 * сокет. Также пулы с одним потоком хорошо подходят для коротких задач, которые
 * должны выполняться отдельно, например мелких задач обновления локального или
 * удаленного журнала или диспетчеризации событий.
 * Если объект SingleThreadExecutor получает более одной задачи, то эти задачи ставятся
 * в очередь. Каждая задача выполняется до завершения, после чего запускается следующая задача;
 * при этом все они используют один поток.
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
    }
}
