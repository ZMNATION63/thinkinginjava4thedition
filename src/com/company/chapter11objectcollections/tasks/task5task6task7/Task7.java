package com.company.chapter11objectcollections.tasks.task5task6task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 7. (3) Создайте класс, затем создайте инициализированный массив объектов этого класса.
 * Заполните контейнер List данными массива.
 * Создайте подмножество List методом subList(), после чего удалите это подмножество из вашего контейнера List
 */
public class Task7 {
    public static void main(String[] args) {
        Task7Class[] task7Class = new Task7Class[10];

        for (int i = 0; i < task7Class.length; i++) {
            task7Class[i] = new Task7Class();
            task7Class[i].name = "Пор-e Имя " + i;
        }

        List<Task7Class> list = /*new ArrayList<Task7Class>*/ Arrays.asList(task7Class);
        print(Arrays.asList(task7Class));
        List<Task7Class> subList = new ArrayList<Task7Class>(list.subList(2, 6));
        print((subList));
        //list.addAll (subList);
        print(list);
        list.removeAll(subList);
        print(list);
        print(subList);
    }

    static void print(List<Task7Class> list) {
        for (int i = 0; i < list.size(); i++) {
            Task7Class temp = list.get(i);
            System.out.print(temp.name + " ");
        }
        System.out.println("");
    }
}