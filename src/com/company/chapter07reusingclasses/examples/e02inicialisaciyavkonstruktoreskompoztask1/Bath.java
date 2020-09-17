package com.company.chapter07reusingclasses.examples.e02inicialisaciyavkonstruktoreskompoztask1;

/**
 * 1. (2) Создайте простой класс. Во втором классе определите ссылку на объект первого класса.
 * Используйте отложенную инициализацию для создания экземпляров этого класса.
 */
public class Bath {
    private String // Инициализация в точке определения:
            sl = "Счастливый",
            s2 = "Счастливый",
            s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath() { // инициализация в конструкторе
        System.out.println("B конструкторе Bath()");
        s3 = "Радостный";
        toy = 3.14f;
        castille = new Soap();
    }

    // Инициализация экземпляра:
    {
        i = 47;
    }

    public String toString() {
        if (s4 == null) // Отложенная инициализация:
            s4 = "Радостный";
        return "sl = " + sl + "\n" +
                "s2 = " + s2 + "\n" + "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n " + " i = " + i + "\n " +
                "toy = " + toy + "\n" +
                "castille = " + castille;
    }
}
