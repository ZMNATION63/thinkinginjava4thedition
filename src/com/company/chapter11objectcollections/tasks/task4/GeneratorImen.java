package com.company.chapter11objectcollections.tasks.task4;

import java.util.*;

/**
 * 4. (3) Создайте класс-генератор, который при каждом вызове next() выдает имена
 * персонажей вашего любимого фильма в виде объектов String. Когда список заканчивается,
 * программа снова возвращается к началу.
 * <p>
 * Используйте генератор для заполнения массива и контейнеров
 * ArrayList
 * LinkedList
 * HashSet
 * LinkedHashSet
 * TreeSet после чего выведите содержимое каждого контейнера.
 */
public class GeneratorImen {
    //public static String s = "Максим Максимов, Федул Жадный, Бог знает какой актеришка!";
    public static String s = "aa, ab, ac, aad, aa";
    public String[] stringArr = s.split(", ");
    public ArrayList<String> arrayList = new ArrayList<String>();
    public LinkedList<String> linkedList = new LinkedList<String>();
    public HashSet<String> hashSet = new HashSet<String>();
    public LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
    public TreeSet<String> treeSet = new TreeSet<String>();

    void next(Collection<String> collection) {
        for (int i = 0; i < stringArr.length; i++) {
            collection.add(stringArr[i]);
        }

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
