package com.company.chapter16arrays.tasks.task2;
/**
 * 2. (1) Напишите метод, который получает аргумент int
 * и возвращает массив указанного размера, заполненный объектами BerylliumSphere .
 */

import java.util.Random;

public class Task2 {
    static BerylliumSphere[] createBerylliumSphereArray(int n) {
        BerylliumSphere el;
        BerylliumSphere[] result = new BerylliumSphere[n];

        for (int i = 0; i < n; i++) {
            el = new BerylliumSphere();
            result[i] = el;
        }
        return result;
    }

    public static void main(String[] args) {
        Random r = new Random(50);

        int z = r.nextInt(10);
        System.out.println("Количество элементов массива BerylliumSphere = " + z);
        BerylliumSphere[] a = createBerylliumSphereArray(z);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
