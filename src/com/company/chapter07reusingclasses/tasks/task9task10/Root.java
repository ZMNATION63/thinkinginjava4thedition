package com.company.chapter07reusingclasses.tasks.task9task10;

public class Root {
    Component1 component1 = new Component1(123456);

    Root(int z) {
        System.out.println("Конструктор по умолчанию класса Root " + z);
    }

    void dispose() {
        System.out.println("dispose() класса Root ");
        component1.dispose();
        this.dispose();

    }

}
