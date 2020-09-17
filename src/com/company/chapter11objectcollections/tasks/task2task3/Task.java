package com.company.chapter11objectcollections.tasks.task2task3;

import java.util.HashSet;
import java.util.Set;

/**
 * 2. (1) Измените пример SimpleCollection.java так, чтобы в качестве контейнера с использовалось множество (Set).
 * <p>
 * 3. (2) Измените пример innerclasses/Sequence.java так, чтобы в контейнер можно было
 * добавить произвольное количество элементов.
 */
public class Task {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<Integer>();
        for (int i = 0; i < 10; i++)
            c.add(i); // Автоматическая упаковка
        for (Integer i : c)
            System.out.print(i + ", ");
    }
}
