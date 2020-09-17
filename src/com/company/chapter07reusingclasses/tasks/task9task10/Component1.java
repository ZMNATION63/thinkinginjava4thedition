package com.company.chapter07reusingclasses.tasks.task9task10;

public class Component1 {
    Component1(int z) {
        System.out.println("Конструктор по умолчанию класса Component1 " + z);
    }

    void dispose() {
        System.out.println("dispose() класса Component1 ");
        //dispose ();
    }
}
