package com.company.chapter12errorhandlingandexceptions.tasks.task5.Part2;

public class SomeClass1 {
    public void f() {
        try {
            System.out.println("Метод f() блок try ");
            g();
        } catch (RuntimeException e) {
            System.out.println("Метод f() блок catch");
            e.getStackTrace();
        }

    }

    ;

    public void g() throws RuntimeException {
        System.out.println("Метод g() ");
        RuntimeException e = new RuntimeException();
        e.printStackTrace();
    }

    ;
}
