package com.company.chapter07reusingclasses.examples.e01kompozicya;

// Композиция для повторного использования кода.
public class SprinklerSystem {
    private String valvel, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    //Композиция, создание элемента другого класса как поле текущего
    private int i;
    private float f;

    public String toString() {
        return
                "valvel = " + valvel + " " +
                        "valve2 = " + valve2 + " " +
                        "valve3 = " + valve3 + " " +
                        "valve4 = " + valve4 + "\n" +
                        "i = " + i + " " + "f " + f +
                        "source * " + source; //как результат композиции мы имеем доступ к приватным полям класса который моздали
        //В результате переопределения метода toString мы можем прочитать значение поля
    }
}
