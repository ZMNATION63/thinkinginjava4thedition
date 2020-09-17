package com.company.chapter13strings.examples.ex04arraylistdisplay;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. (1) Исправьте ошибку в InfiniteRecursion.java
 * <p>
 * Цель показать, что метод toString класса Object выводит адреса на экран
 */
class InfiniteRecursion {
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v =
                new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }
}