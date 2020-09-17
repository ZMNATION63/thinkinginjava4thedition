package com.company.chapter21parallelexecution.examples.ex044exchangerdemo;

import com.company.chapter21parallelexecution.examples.ex043pool.Fat;
import com.company.chapter21parallelexecution.tasks.task02.Generator;

import java.util.List;
import java.util.concurrent.*;

class ExchangerProducer<T> implements Runnable {
    private Generator<T> generator;
    private Exchanger<List<T>> exchenger;
    private List<T> holder;

    ExchangerProducer(Exchanger<List<T>> exchenger, Generator<T> gen, List<T> holder) {
        exchenger = exchenger;
        generator = gen;
        this.holder = holder;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                for (int i = 0; i < ExchangerDemo.size; i++) {
                    holder.add(generator.next());
                    /*полный список меняем с пустым*/
                    holder = exchenger.exchange(holder);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted in ExchangerProducer<T>.run()");
        }
    }
}

class ExchangerConsumer<T> implements Runnable {
    private Exchanger<List<T>> exchanger;
    private List<T> holder;
    private volatile T value;

    ExchangerConsumer(Exchanger<List<T>> ex, List<T> holder) {
        exchanger = ex;
        this.holder = holder;

    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                holder = exchanger.exchange(holder);
                for (T x : holder) {
                    value = x;
                    holder.remove(x);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("  =========== ");
        }
        System.out.println("Final value: " + value);
    }
}

public class ExchangerDemo {
    static int size = 10;
    static int delay = 5;

    public static void main(String[] args) throws InterruptedException {
        if (args.length > 0)
            size = new Integer(args[0]);
        if (args.length > 1)
            delay = new Integer(args[1]);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Exchanger<List<Fat>> xc = new Exchanger<List<Fat>>();
        List<Fat> producerList = new CopyOnWriteArrayList<>(),
                consumerList = new CopyOnWriteArrayList<>();
        executorService.execute(new ExchangerProducer<Fat>(xc, BasicGenerator.create(Fat.class), producerList));
        executorService.execute(
                new ExchangerConsumer<Fat>(xc, consumerList));
        TimeUnit.SECONDS.sleep(delay);
        executorService.shutdownNow();
    }
}
