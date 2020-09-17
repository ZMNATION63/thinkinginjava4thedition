package com.company.chapter07reusingclasses.examples.e015neizmenyaemyemetody;

public class Overridingprivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f() ");
    }

    private void g() {
        System.out.println("OverridingPrivate.g()");
    }

    public void metod2() {
        System.out.println("Метод для переопределения");
    }

    public final void metod() {
        System.out.println("Это ФИНАЛЬНЫЙ метод");
    }

}
