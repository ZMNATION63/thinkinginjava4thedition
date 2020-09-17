package com.company.chapter11objectcollections.examples.ex03genericsandupcasting;
/**
 * При помещении объекта в контейнер вы не ограничены точным типом, указанным
 * в параметре обобщенного типа. Восходящее преобразование работает с обобщенными
 * типами точно так же, как и с любыми другими типами
 * <p>
 * Таким образом, в контейнер для объектов Apple можно поместить объект одного из
 * субтипов Apple.
 */

import java.util.ArrayList;

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple c : apples)
            System.out.println(c.getClass());
    }
}
