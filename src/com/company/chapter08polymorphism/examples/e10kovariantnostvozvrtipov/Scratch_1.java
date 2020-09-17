package com.company.chapter08polymorphism.examples.e10kovariantnostvozvrtipov;

/**
 * Ковариантность возвращаемых типов позволяет вернуть более специализированный
 * тип Wheat
 */
class Scratch_1 {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();//возвращает ссылку на Grain
        System.out.println(g);//Вывод Grain
        m = new WheatMill();//  WheatMill extends Mill приведение вни от Mill до WheatMill
        g = m.process(); // WheatMill.process () Возвращает Wheat ();
//        Wheat w = new WheatMill().process ();
        System.out.println(g); //Вывод Wheat
    }
}