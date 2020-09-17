package com.company.chapter07reusingclasses.examples.e017inicializaciyasnasledovaniem;

public class Beetle extends Insect {
    private int k = printInit("noneBeetle.kинициализировано");

    public Beetle() {
        System.out.println("k=" + k);
        System.out.println("j=" + j);
    }

    private static int x2 =
            printInit("nonestaticBeetle.x2инициализировано");

}
