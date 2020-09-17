package com.company.chapter21parallelexecution.examples.ex03fixedthreadpool;


import com.company.chapter21parallelexecution.examples.ex01liftoff.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * При использовании FixedThneadPool высокозатратное создание потоков выполняется
 * один раз (в самом начале), поэтому количество потоков ограничивается. Такая схема
 * экономит время, потому что вам не нужно многократно «платить» за создание потока
 * каждой задачи. Кроме того, в событийной системе обработчики событий, требующие
 * применения потоков, будут обслуживаться с нужной быстротой, для чего потоки будут
 * извлекаться из пула Перерасход ресурсов также исключен, потому что FixedThreadPool
 * использует ограниченное количество объектов Thread.
 * <p>
 * Он может пригодиться для любых продолжительных задач, выполняемых
 * в другом потоке, например задачи прослушивания входящих подключений через
 * сокет. Также пулы с одним потоком хорошо подходят для коротких задач, которые
 * должны выполняться отдельно, например мелких задач обновления локального или
 * удаленного журнала или диспетчеризации событий
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
    }
}
