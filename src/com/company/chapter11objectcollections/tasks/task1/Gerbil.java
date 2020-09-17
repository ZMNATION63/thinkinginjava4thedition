package com.company.chapter11objectcollections.tasks.task1;

/**
 * 1. (2) Создайте новый класс с именем Gerbil с полем gerbilNumber типа int, инициализируемым в конструкторе.
 * Определите в нем метод hop(), который выводит значение  gerbilNumber и короткое сообщение.
 * Создайте контейнер ArrayList и добавьте в него объекты Gerbil.
 * Используйте метод get() для перебора элементов и вызова hop() для каждого объекта Gerbil.
 */
public class Gerbil {
    private static int gerbillNumber;

    public int getGerbillNumber() {
        return gerbillNumber;
    }

    public void setGerbillNumber(int gerbillNumber) {
        this.gerbillNumber = gerbillNumber;
    }

    public void hop() {
        System.out.println("Экземпляр песчинки № " + gerbillNumber);
    }

    public Gerbil() {
        setGerbillNumber(getGerbillNumber());
        setGerbillNumber(getGerbillNumber() + 1);
        System.out.println("Количество песчинок увеличено на 1 экземпляр " + gerbillNumber);

    }


}
