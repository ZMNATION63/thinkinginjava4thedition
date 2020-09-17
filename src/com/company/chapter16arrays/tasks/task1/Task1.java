package com.company.chapter16arrays.tasks.task1;

/**
 * 1. (2) Создайте метод, получающий в аргументе массив объектов BerylliumSphere.
 * Вызовите метод с динамическим созданием аргумента.
 * Продемонстрируйте, что
 * обычная групповая инициализация массива в этом случае не работает.
 * <p>
 * Найдите cитуации, в которых обычная групповая инициализация массива работает,
 * а динамическая групповая инициализация оказывается излишней.
 * BerylliumSphere[] a;
 * Динасическая групповая инициализация
 * a = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(),};
 */


public class Task1 {
    static void printarray(BerylliumSphere[] z) {
        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
    }

    ;

    public static void main(String[] args) {
        BerylliumSphere[] a;

        printarray(a = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(),});
        System.out.println("");

//        Обычная динамическая инициализация не работает
        printarray(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()});
        System.out.println("");

        BerylliumSphere[] d = new BerylliumSphere[]{new BerylliumSphere(),
                new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        printarray(d);

    }
}
