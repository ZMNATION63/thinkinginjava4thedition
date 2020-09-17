package com.company.chapter11objectcollections.examples.ex05dobavlenyegruppelementov;

import java.util.*;

/**
 * Конструктор Collection может получить другой объект Collection, который используется для инициализации,
 * так что вы можете использовать Arrays. asList( ) для получения входныхданных конструктора.
 * <p>
 * Метод Collection. addAll() может получать в аргументе только другой объект Collection,
 * поэтому он не обладает такой гибкостью, как методы Arrays. asList() или Collections.
 * addAll (), использующие списки аргументов переменной длины.
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        // Работает значительно быстрее, но Collection
        // так сконструировать невозможно:
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        // Создает список "на базе" массива:
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
        for (int i = 0; i < moreInts.length; i++) {
            System.out.println(moreInts[i]);
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // OK -- изменить элемент
        // list.add(21); // Ошибка времени выполнения, потому что
        // размер базового массива изменяться не может.

    }
}
