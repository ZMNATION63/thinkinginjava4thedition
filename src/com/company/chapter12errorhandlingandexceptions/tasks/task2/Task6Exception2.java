package com.company.chapter12errorhandlingandexceptions.tasks.task2;

public class Task6Exception2 extends Exception {
    public Task6Exception2() {
    }

    public Task6Exception2(String str) {
        super(str);
    }

    @Override
    public String getMessage() {
        return "Подробная информация о классе " + super.getMessage();
    }
}
