package com.company.chapter11objectcollections.examples.ex04osnovnyeconcept;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Интерфейс Collection обобщает концепцию последовательности — способа хранения
 * группы объектов. Следующий простой пример заполняет объект Collection (представленный классом ArrayList)
 * объектами Integer и выводит каждый элемент в полученном контейнере:
 * <p>
 * Так как в этом примере используются только методы Collection, подойдет объект
 * любого класса, производного от Collection, но самым распространенным типом последовательности является ArrayList
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            c.add(i); // Автоматическая упаковка
        for (Integer i : c)
            System.out.print(i + ", ");
    }
}

