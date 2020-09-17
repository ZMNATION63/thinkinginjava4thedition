package com.company.chapter21parallelexecution.examples.ex036pipedio;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Использование каналов для организации ввода-вывода между задачами
 * Часто бывает полезно организовать взаимодействие потоков посредством механизмов
 * ввода-вывода. Библиотеки потоков могут предлагать поддержку ввода-вывода между
 * потоками в форме каналов (pipes). Последние существуют в стандартной библиотеке
 * <p>
 * BBOfla-BbiBOflaJava в виде классов PipedWriter (позволяет потоку записывать в канал)
 * и PipedReader (предоставляет возможность другому потоку считывать из того же
 * канала).
 */
class Sender implements Runnable {
    private Random random = new Random(47);
    private PipedWriter out = new PipedWriter();

    public PipedWriter getPipedWriter() {
        return out;
    }

    @Override
    public void run() {
        try {
            while (true) {
                for (char c = 'A'; c <= 'z'; c++) {
                    out.write(c);
                    TimeUnit.MILLISECONDS.sleep(random.nextInt(500));
                }
            }
        } catch (IOException | InterruptedException e) {
            if (e instanceof InterruptedException) System.out.println(e + "Sender sleep interrupted");
            System.out.println(e + "Sender write interrupted");
        }
    }
}

class Receiver implements Runnable {
    private PipedReader in;

    public Receiver(Sender sender) throws IOException {
        in = new PipedReader(sender.getPipedWriter());
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Read: " + (char) in.read() + " ");
            }
        } catch (IOException e) {
            System.out.println(e + " Receiver read exception");
        }
    }
}

public class PipedIO {
    public static void main(String[] args) throws IOException, InterruptedException {
        Sender sender = new Sender();
        Receiver receiver = new Receiver(sender);
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(sender);
        executorService.execute(receiver);
        TimeUnit.SECONDS.sleep(4);
        executorService.shutdownNow();
    }
}
