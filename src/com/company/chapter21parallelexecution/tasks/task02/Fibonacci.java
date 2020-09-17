package com.company.chapter21parallelexecution.tasks.task02;

/**
 * 2. (2) По образцу generics/Fibonacci.java создайте задачу, которая генерирует
 * последовательность из n чисел Фибоначчи (значение n передается в конструкторе задачи).
 * Создайте несколько таких задач и выполните их в потоках.
 */
public class Fibonacci implements Generator<Integer>, Runnable {

    private int iter = 0;
    private int count = 0;

    public Integer next() {
        return fib(count++);
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

    @Override
    public void run() {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < this.iter; i++) {
            System.out.println(fibonacci.next());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new Fibonacci(30)).start();
        }
    }
}
