package com.company.chapter08polymorphism.examples.e07nasledovanieizavershaushiedeystv;

public class Characteristic {
    private String s;


    Characteristic(String s) {
        this.s = s;
        System.out.println("Создаем Characteristic" + s);
    }

    protected void dispose() {
        System.out.println("Завершаем MCharacteristic" + s);
    }
}
