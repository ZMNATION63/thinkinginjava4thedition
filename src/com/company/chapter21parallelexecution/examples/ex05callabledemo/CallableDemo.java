package com.company.chapter21parallelexecution.examples.ex05callabledemo;


import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        ArrayList<Future<String>> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(executorService.submit(new TaskWithResult(i)));
        }

        for (Future<String> fs : result) {
            try {
                System.out.println(fs.get());
            } catch (ExecutionException | InterruptedException e) {
                System.out.println(e);
            } finally {
                executorService.shutdown();
            }
        }
    }
}
