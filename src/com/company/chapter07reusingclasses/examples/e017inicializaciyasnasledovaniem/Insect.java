package com.company.chapter07reusingclasses.examples.e017inicializaciyasnasledovaniem;

public class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i=" + i + ",j=" + j);
        j = 39;
    }

    private static int xl =
            printInit("nonestaticInsect.xlинициализировано");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}
