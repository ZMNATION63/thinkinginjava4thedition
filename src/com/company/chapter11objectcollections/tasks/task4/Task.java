package com.company.chapter11objectcollections.tasks.task4;

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
public class Task {
    public static void main(String[] args) {
        GeneratorImen generatorImen = new GeneratorImen();
        generatorImen.next(generatorImen.arrayList);
        generatorImen.next(generatorImen.hashSet);
        generatorImen.next(generatorImen.linkedList);
        generatorImen.next(generatorImen.linkedHashSet);
        generatorImen.next(generatorImen.treeSet);
    }
}
