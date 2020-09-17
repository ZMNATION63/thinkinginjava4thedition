package com.company.chapter15generictypes.examples.ex01automobile;

public class Holder2 {
    private Object a;

    public Holder2(Object а) {
        this.a = а;
    }

    public void set(Object а) {
        this.a = а;
    }

    public Object get() {
        return a;
    }

    public static void main(String[] args) {
        Holder2 h2 = new Holder2(new Automobile());
        Automobile а = (Automobile) h2.get();
        h2.set("Not an Automobile");
        System.out.println(h2.get() + " Holder2 поле a");
        String s = (String) h2.get();

        h2.set(1); // Автоматическая упаковка в Integer
        Integer x = (Integer) h2.get();
        System.out.println(x);
        System.out.println(s);
        System.out.println(h2.get() + " Holder2 поле a");
    }
}
