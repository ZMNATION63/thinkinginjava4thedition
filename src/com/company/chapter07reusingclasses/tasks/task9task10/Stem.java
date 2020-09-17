package com.company.chapter07reusingclasses.tasks.task9task10;

public class Stem extends Root {
    Stem(int z) {
        super(z);
        System.out.println("Конструктор по умолчанию класса Steam " + z);
    }

    void dispose() {
        System.out.println("dispose() класса Steam ");
        //this.dispose ();
        super.dispose();

    }
}
