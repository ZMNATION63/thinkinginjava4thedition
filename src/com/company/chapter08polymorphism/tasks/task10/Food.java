package com.company.chapter08polymorphism.tasks.task10;

public class Food {
    public void make() {
        System.out.println("Food.make()");
    }

    private void testPrivate() { //Проблема: «переопределение» закрытых методов
        System.out.println("Private Food.testPrivate");
    }
}
