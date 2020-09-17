package com.company.chapter16arrays.examples.ex04multidimensionalprimitivearray;

import java.util.Arrays;
import java.util.Random;

public class MultidimensionalPrimitiveArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3,},
                {4, 5, 6}};
        System.out.println(Arrays.deepToString(a));

        //3-Darraywithfixedlength:
        System.out.println("3-D array with fixed length: ");
        int[][][] b = new int[3][3][4];//матрица 3 строуина на 3 столбца по 4 элемента заполненными нулями
        System.out.println(Arrays.deepToString(b));

        Random rand = new Random(47);
//Трехмерныймассивсвекторамипеременнойдлины:
        System.out.println("Трехмерный массив с векторами переменной длины: ");
        int[][][] x = new int[rand.nextInt(7)][][];
        for (int i = 0; i < x.length; i++) {
            x[i] = new int[rand.nextInt(5)][];
            for (int j = 0; j < x[i].length; j++)
                x[i][j] = new int[rand.nextInt(5)];
        }
        System.out.println(Arrays.deepToString(x));

        System.out.println("Трехмерный  массив BerylliumSphere с векторами переменной длины: ");
        BerylliumSphere[][] spheres = {
                {new BerylliumSphere(), new BerylliumSphere()},
                {new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere()},
                {new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere()},
        };
        System.out.println(Arrays.deepToString(spheres));

        System.out.println("Автоматическая упаковка работает в массивах");

        Integer[][] c = { // A u to b o x in g :
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                {71, 72, 73, 74, 75, 76, 77, 78, 79, 80}
        };
        System.out.println(Arrays.deepToString(c));

        System.out.println("Создание многомерных м ассивов");
        Integer[][] v;
        v = new Integer[3][];
        for (int i = 0; i < v.length; i++) {
            v[i] = new Integer[3];
            for (int j = 0; j < v[i].length; j++)
                v[i][j] = i * j;//Автоматическаяупаковка
        }
        System.out.println(Arrays.deepToString(v));

        System.out.println("Мнтогомерные массивы объектов-оберток");
        Integer[][] al = {//Автоматическаяупаковка
                {1, 2, 3,},
                {4, 5, 6,},
        };
        Double[][][] a2 = {//Автоматическаяупаковка
                {{1.1, 2.2}, {3.3, 4.4}},
                {{5.5, 6.6}, {7.7, 8.8}},
                {{9.9, 1.2}, {2.3, 3.4}},
        };
        String[][] a3 = {
                {"The", "Quick", "Sly", "Fox"},
                {"lumped", "Over"},
                {"The", "Lazy", "Brown", "Dog", "and", "friend"},
        };
        System.out.println("al:" + Arrays.deepToString(al));
        System.out.println("a2:" + Arrays.deepToString(a2));
        System.out.println("a3:" + Arrays.deepToString(a3));
    }
}


