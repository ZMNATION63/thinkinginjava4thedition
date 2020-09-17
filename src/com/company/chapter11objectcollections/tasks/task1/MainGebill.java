package com.company.chapter11objectcollections.tasks.task1;

import java.util.ArrayList;

/**
 * 1. (2) Создайте новый класс с именем Gerbil с полем gerbilNumber типа int, инициализируемым в конструкторе.
 * Определите в нем метод hop(), который выводит значение  gerbilNumber и короткое сообщение.
 * Создайте контейнер ArrayList и добавьте в него объекты Gerbil.
 * Используйте метод get() для перебора элементов и вызова hop() для каждого объекта Gerbil.
 */
public class MainGebill {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilList = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++) {
            gerbilList.add(new Gerbil());
        }

        for (int i = 0; i < gerbilList.size(); i++) {
            gerbilList.get(i).hop();
        }
    }
}
