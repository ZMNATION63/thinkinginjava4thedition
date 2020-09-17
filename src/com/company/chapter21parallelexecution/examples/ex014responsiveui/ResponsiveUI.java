package com.company.chapter21parallelexecution.examples.ex014responsiveui;

import java.io.IOException;

/**
 * UnresponsiveUI выполняет вычисления в бесконечном цикле while. Очевидно, что строка, в которой
 * производится чтение с консоли (условие цикла while позволяет «обвести вокруг пальца» компилятор,
 * который полагает, что строка с вводом достижима), никогда не будет достигнута. Если вы уберете
 * комментарий со строки, создающей объект UnresponsiveUI, и запустите программу, то для выхода из
 * нее процесс придется уничтожить.
 */
class UnresponsiveUI {
    private volatile double d = 1;

    public UnresponsiveUI() throws Exception {
        while (d > 0)
            d = d + (Math.PI + Math.E) / d;
        System.in.read(); // Never gets here
    }
}

public class ResponsiveUI extends Thread {
    private static volatile double d = 1;

    public ResponsiveUI() {
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true) {
            d = d + (Math.PI + Math.E) / d;
        }
    }

    public static void main(String[] args) throws IOException {
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);
    }
}