package com.company.chapter11objectcollections.tasks.task12;

import java.util.*;

/**
 * 12. (3) Создайте и заполните контейнер List<integer>. Создайте второй контейнер
 * List<lnteger> того же размера. Используйте итераторы Listlterator для чтения
 * элементов из первого контейнера List и вставки их во второй контейнер в обратном
 * порядке. (Проанализируйте несклько разных способов решения этой задачи.)
 */
public class Task {
    public static void main(String[] args) {
        Random random = new Random(74);

        List<Integer> integerList = new ArrayList();
        for (int i = 0; i < 20; i++) {
            integerList.add(random.nextInt(150));
        }

        ListIterator<Integer> iterator = integerList.listIterator();
        //while (iterator.hasNext ()) {
        //    System.out.print (iterator.next () + " ");
        //}

        List<Integer> list2 = new ArrayList();
        while (iterator.hasPrevious()) {
            list2.add(iterator.previous().intValue());
        }
        System.out.println("");
        printALL(Collections.singletonList(list2));
    }

    static void printALL(List<Object> list) {
        Iterator<Object> iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next() + ", ");
        }
        System.out.println("");
    }
}
