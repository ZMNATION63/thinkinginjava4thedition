package com.company.chapter10innerclasses.tasks.task6.c1;


import com.company.chapter10innerclasses.tasks.task6.p1.Interface1;

public class C1 {
    private String s;

    public Inner makeInner() {
        return new Inner();
    }

    private class Inner implements Interface1 {
        Inner() {
            this.metInter1();
        }

        @Override
        public void metInter1() {
            s = "Implemented Interface to PRIVATE INNER CLASS";
            System.out.println(s);
        }
    }
}
