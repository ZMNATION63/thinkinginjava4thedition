package com.company.chapter15generictypes.examples.ex08genericmethods;

/**
 * Цель показать, что обобщенные методы спмостоятельно определяют тип подсунутый им
 * Считая подсунутое Class<> == Object здесь мы уже имеем метод
 */
public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}
