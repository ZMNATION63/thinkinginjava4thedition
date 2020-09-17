package com.company.chapter11objectcollections.examples.ex02applesandorangeswithgenerics;

import java.util.ArrayList;

/**
 * Теперь компилятор не позволяет поместить в apples объект Orange; таким образом,
 * разработчик узнает об ошибке не во время выполнения, а во время компиляции
 */
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
// Ошибка во время компиляции:
// apples.add(new OrangeQ);
        for (int i = 0; i < apples.size(); i++)
            System.out.println(apples.get(i).id());
// Использование синтаксиса foreach:
        for (Apple c : apples)
            System.out.println(c.id());
    }
}