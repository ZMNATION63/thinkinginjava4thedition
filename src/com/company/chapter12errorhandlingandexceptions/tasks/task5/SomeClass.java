package com.company.chapter12errorhandlingandexceptions.tasks.task5;

public class SomeClass {
    public void f() {
        try {
            System.out.println("Метод f() блок try ");
            g();
        } catch (Exception e) {
            System.out.println("Метод f() блок catch");
            e.getStackTrace();
        }

    }

    ;

    public void g() throws Task5Exception {
        System.out.println("Метод g() ");
        Task5Exception e = new Task5Exception();
        e.printStackTrace();
    }

    ;
}
