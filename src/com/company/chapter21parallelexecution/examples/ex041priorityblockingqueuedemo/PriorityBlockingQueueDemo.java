package com.company.chapter21parallelexecution.examples.ex041priorityblockingqueuedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * По сути это приоритетная очередь с блокирующими операциями выборки.
 * В следующем примере объекты приоритетной очереди представляют собой задачи, которые
 * извлекаются из очереди в порядке приоритетов
 */
class PrioritizedTask implements Runnable, Comparable<PrioritizedTask> {
    private Random random = new Random(47);
    private static int counter = 0;
    private final int id = counter++;
    private final int priority;
    protected static List<PrioritizedTask> sequrnce = new ArrayList<>();

    public PrioritizedTask(int priority) {
        this.priority = priority;
    }

    public int compareTo(PrioritizedTask arg) {
        return priority < arg.priority ? 1 : (priority > arg.priority ? -1 : 0);
    }

    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(random.nextInt(250));
        } catch (InterruptedException e) {
            System.out.println("Interrupted in PrioritizedTask.run()");
        }
        System.out.println(this);
    }

    public String toString() {
        return String.format("[%1$-3d]", priority) + " Task " + id;
    }

    public String summary() {
        return "(" + id + ":" + priority + ")";
    }

    public static class EndSentinel extends PrioritizedTask {
        private ExecutorService executorService;

        public EndSentinel(ExecutorService executorService) {
            super(-1);
            this.executorService = executorService;
        }

        @Override
        public void run() {
            int count = 0;
            for (PrioritizedTask pt : sequrnce) {
                System.out.println(pt.summary());
                if (++count % 5 == 0)
                    System.out.println(" ");
            }
            System.out.println(" ");
            System.out.println(this + " Calling shutdownNow()");
            executorService.shutdownNow();
        }
    }
}

class PrioritizedTaskProducer implements Runnable {
    private Random random = new Random(47);
    private Queue<Runnable> queue;
    private ExecutorService executorService;

    public PrioritizedTaskProducer(Queue<Runnable> queue, ExecutorService executorService) {
        this.queue = queue;
        this.executorService = executorService;
    }

    @Override
    public void run() {
        /**
         * Неограниченная очередь, блокировка никогда не происходит
         * Заполняем случайными приоритетами
         */
        for (int i = 0; i < 20; i++) {
            queue.add(new PrioritizedTask(random.nextInt(10)));
            Thread.yield();
        }
        /**
         * Добавляем высоко приоритетные задания
         */
        try {
            for (int i = 0; i < 10; i++) {
                TimeUnit.MILLISECONDS.sleep(250);
            }
            /**
             * Добавляем задания начиная с низких приоритетов
             */
            for (int i = 0; i < 10; i++) {
                queue.add(new PrioritizedTask(i));
            }
            /**
             * сторож останавливающий все задания
             */
            queue.add(new PrioritizedTask.EndSentinel(executorService));
        } catch (InterruptedException e) {
            System.out.println("Finished PrioritizedTaskProducer");
        }
    }

    static class PrioritizedTaskConsumer implements Runnable {
        private PriorityBlockingQueue<Runnable> q;

        public PrioritizedTaskConsumer(PriorityBlockingQueue<Runnable> q) {
            this.q = q;
        }

        @Override
        public void run() {
            try {
                while (!Thread.interrupted()) {
                    /**
                     * для запуска задачи используется текущий поток
                     */
                    q.take().run();
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted exceprion PrioritizedTaskConsumer.run()");
            }
            System.out.println("Finished PrioritazedTaskConsumer");
        }
    }
}

public class PriorityBlockingQueueDemo {
    public static void main(String[] args) {
        Random random = new Random(47);
        ExecutorService executorService = Executors.newCachedThreadPool();
        PriorityBlockingQueue<Runnable> queue = new PriorityBlockingQueue<>();
        executorService.execute(new PrioritizedTaskProducer(queue, executorService));
        executorService.execute(new PrioritizedTaskProducer.PrioritizedTaskConsumer(queue));
    }
}
