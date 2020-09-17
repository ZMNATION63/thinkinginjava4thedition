package com.company.chapter12errorhandlingandexceptions.tasks.task4;

public class SpecilClass {

    FirstException f1() throws FirstException {
        return new FirstException();
    }

    SecondException f2() throws SecondException {
        return new SecondException();
    }
}
