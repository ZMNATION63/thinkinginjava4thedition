package com.company.chapter07reusingclasses.examples.e015neizmenyaemyemetody;

public class DemonstarateClass extends Overridingprivate {
    /*public void metod(){
        System.out.println ("Переопределенный метод");
    } // компилятор ругается на унаследованный метол, мол он финальный*/
    @Override
    public void metod2() {
        super.metod2();
        System.out.println("Переопределенный метод ");
    }
}
