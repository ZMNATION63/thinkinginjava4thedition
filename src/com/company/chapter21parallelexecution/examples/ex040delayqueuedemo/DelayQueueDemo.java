package com.company.chapter21parallelexecution.examples.ex040delayqueuedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.NANOSECONDS;

class DelayedTask implements Runnable, Delayed {
    private static int counter = 0;
    private final int id = counter++;
    private final int delta;
    private final long trigger;
    protected static List<DelayedTask> sequence = new ArrayList<DelayedTask>();

    public DelayedTask(int delayInMileseconds) {
        delta = delayInMileseconds;
        trigger = System.nanoTime() + NANOSECONDS.convert(delta, MILLISECONDS);
        sequence.add(this);
    }

    public long getDelay(TimeUnit unit) {
        return unit.convert(trigger - System.nanoTime(), NANOSECONDS);
    }

    public int compareTo(Delayed arg) {
        DelayedTask that = (DelayedTask) arg;
        if (trigger < that.trigger) return -1;
        if (trigger > that.trigger) return 1;
        return 0;
    }

    @Override
    public void run() {
        System.out.println(this + " ");
    }

    public String toString() {
        return String.format("[%1$-4d]", delta) + " Task " + id;

    }

    public String summary() {
        return "(" + id + ": " + delta + ")";
    }

    public static class EndSentinel extends DelayedTask {
        private ExecutorService executorService;

        public EndSentinel(int delay, ExecutorService e) {
            super(delay);
            executorService = e;
        }

        @Override
        public void run() {
            for (DelayedTask pt : sequence) {
                System.out.print(pt.summary() + " ");
            }
            System.out.println(" ");
            System.out.println(this + " Callinf shutdownNow()");
            executorService.shutdownNow();
        }

    }
}


class DelayedTaskConsumer implements Runnable {
    private DelayQueue<DelayedTask> q;

    public DelayedTaskConsumer(DelayQueue<DelayedTask> q) {
        this.q = q;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                q.take();
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted in DelayedTaskConsumer.run()");
        }
        System.out.println("Finished DelayTaskConsumer");
    }
}

public class DelayQueueDemo {
    public static void main(String[] args) {
        Random random = new Random(47);
        ExecutorService executorService = Executors.newCachedThreadPool();
        DelayQueue<DelayedTask> queue = new DelayQueue<>();
/**
 * Заполняем задачами со случайным значением
 */
        for (int i = 0; i < 20; i++) {
            queue.put(new DelayedTask(random.nextInt(5000)));
        }
        queue.add(new DelayedTask.EndSentinel(5000, executorService));

    }
}
