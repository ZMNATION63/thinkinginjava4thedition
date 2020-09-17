package com.company.chapter16arrays.examples.ex02arrayoptions;

import java.util.Arrays;

public class ArrayOptions {
    public static void main(String[] args) {
        // Массив объектов:
        BerylliumSphere[] a; // Локальная неинициализированная переменная
        BerylliumSphere[] b = new BerylliumSphere[5];

        // Ссылки в массиве автоматически
        // инициализируются null:
        System.out.println("b: " + Arrays.toString(b));
        BerylliumSphere[] c = new BerylliumSphere[4];
        for (int i = 0; i < c.length; i++)
            if (c[i] == null) // Можно проверить ссылку на null
                c[i] = new BerylliumSphere();

        // Групповая инициализация:
        BerylliumSphere[] d = {new BerylliumSphere(),
                new BerylliumSphere(), new BerylliumSphere()};

        // Динамическая групповая инициализация:
        a = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(),};

        // (Завершающая запятая в обоих случаях не обязательна)
        System.out.println("a.length = " + a.length);
        System.out.println("b.length = " + b.length);
        System.out.println("c.length = " + c.length);
        System.out.println("d.length = " + d.length);
        a = d;
        System.out.println("a.length = " + a.length);

        // Массивы примитивов:
        int[] e; // Null-ссыпка
        int[] f;// = new int[5];
        String g1 = null;

        // Примитивы в массиве автоматически
        // инициализируются нулями:
        System.out.println(g1);
        //System.out.println("f: " + Arrays.toString(f));
        int[] g = new int[4];
        for (int i = 0; i < g.length; i++)
            g[i] = i * i;
        int[] h = {11, 47, 93};

        // Ошибка компиляции:
//        System.out.println("e.length = ", + e.length);
//        System.out.println("f.length = " + f.length);
        System.out.println("g.length = " + g.length);
        System.out.println("h.length = " + h.length);
        e = h;
        System.out.println("e.length = " + e.length);
        e = new int[]{1, 2};
        System.out.println("e.length = " + e.length);
        //переменная e не инициализирована:

    }


}
