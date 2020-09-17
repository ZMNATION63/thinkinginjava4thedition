package com.company.chapter21parallelexecution.tasks.task05;


import com.company.chapter21parallelexecution.tasks.task02.Generator;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * (2) Измените упражнение 2, чтобы задача была представлена объектом Callable
 * для суммирования значений всех чисел Фибоначчи. Создайте несколько задач
 * и выведите результаты.
 */
public class Fibonacci implements Generator<Integer>, Callable<Fibonacci> {

    private int iter;
    private int count = 0;

    public Integer next() {
        return fib(count++);
    }

    @Override
    public Fibonacci call() throws Exception {
        Fibonacci fibonacci = new Fibonacci();

        for (int i = 0; i < this.iter; i++) {
            System.out.println(fibonacci.next());
        }
        return fibonacci;
    }

    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public Fibonacci() {
    }

    public Fibonacci(int nCount) {
        this.iter = nCount;
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<Fibonacci>> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            results.add(exec.submit(new Fibonacci(i)));
        }

        for (Future<Fibonacci> fs : results) {
            try {
                System.out.println(fs.get().next());
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                System.out.println(e);
            } finally {
                exec.shutdown();
            }
        }
    }
}
