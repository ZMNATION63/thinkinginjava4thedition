package com.company.chapter07reusingclasses.tasks.task8;

public class B2 extends A1 {
    B2() {
        super(12);
        System.out.println("Конструктор по умолчанию класс B1 z = 12");
    }

    B2(int z) {
        super(z);
        System.out.println("Конструктор не по умолчанию класс B1 z = " + z);
    }
}
