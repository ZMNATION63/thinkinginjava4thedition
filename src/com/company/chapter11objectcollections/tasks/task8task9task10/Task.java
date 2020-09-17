package com.company.chapter11objectcollections.tasks.task8task9task10;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * STR 340
 * 8. (1) Измените упражнение 1 так, чтобы для перемещения по контейнеру List при
 * вызовах hop() использовался итератор Iterator.
 * <p>
 * 9. (4) Измените пример innerdasses/Sequence.java так, чтобы контейнер Sequence работал
 * с Iterator вместо Selector.
 * 10. (2) Измените упражнение 9 из главы 8, чтобы объекты Rodent хранились в контейнере A r r a y L i s t , a ^ 4
 * перебора последовательности Rodent использовался итератор
 * iterator.
 * 11. (2) Напишите метод, который использует Iterator для перебора Collection и выводит результат вызова toString()
 * для каждого объекта в контейнере. Заполните
 * объектами разные типы Collection и примените свой метод к каждому контейнеру
 */
public class Task {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilList = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++) {
            gerbilList.add(new Gerbil());
        }

        Iterator<Gerbil> iter = gerbilList.iterator();

        while (iter.hasNext()) {
            iter.next().hop();
        }
        printALL(Collections.singletonList(gerbilList));
    }

    static void printALL(List<Object> list) {
        Iterator<Object> iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next() + "\n");
        }
    }
}
