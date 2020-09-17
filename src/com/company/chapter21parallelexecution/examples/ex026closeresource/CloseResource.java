package com.company.chapter21parallelexecution.examples.ex026closeresource;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Прерывание заблокированной задачи посредством.
 * закрытия ресурса> по которому она блокируется: {RunByHand}
 */
public class CloseResource {
    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ServerSocket server = new ServerSocket(8080);
        InputStream socketInput = new Socket("localhost", 8080).getInputStream();
        executorService.execute(new IOBlocked(socketInput));
        executorService.execute(new IOBlocked(System.in));
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println("Shhutting down all threads");
        executorService.shutdown();
    }
}
