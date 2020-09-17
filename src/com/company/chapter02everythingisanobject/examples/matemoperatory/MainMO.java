package com.company.chapter02everythingisanobject.examples.matemoperatory;//: operators/MathOps.java
// Демонстрация математических операций,
/*
 * 4. (2) Напишите программу, которая вычисляет скорость для постоянных значений расстояния и времени.
 * */

import java.util.Random;

class MainMO {
    public static void main(String[] args) {
        double s = 128;
        double t = 2;
        double vi = s / t;
        System.out.println("Скорость = путь / время = " + vi);
        System.out.println("++++++++++++++++++++++++++++++++++++");
        // Создание и раскрутка генератора случайных чисел
        Random rand = new Random(47);
        int i, j, k;
        // Выбор значения от 1 до 100:
        j = rand.nextInt(100) + 1;
        System.out.println("j : " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k : " + k);
        i = j + k;
        System.out.println("j + k : " + i);
        i = j - k;
        System.out.println("j - k : " + i);
        i = k / j;
        System.out.println("k / j : " + i);
        i = k * j;
        System.out.println("k * j : " + i);
        i = k % j;
        System.out.println("k % j :" + i);
        // Тесты для вещественных чисел
        float u, v, w;
        // также можно использовать double
        v = rand.nextFloat();
        System.out.println("v : " + v);
        w = rand.nextFloat();
        System.out.println("w : " + w);
        u = v + w;
        System.out.println("v + w : " + u);
        u = v - w;
        System.out.println("v - w : " + u);
        //float u = v * w;
        System.out.println("v * w :" + u);
        u = v / w;
        System.out.println("v / w :" + u);
        // следующее также относится к типам
        // char, byte, short, int, long и double:
        u += v;
        System.out.println("u += v: " + u);
        u -= v;
        System.out.println("u -= v : " + u);
        u *= v;
        System.out.println("u *= v : " + u);
        u /= v;
        System.out.println("u /= v : " + u);

    }
}
/* Output:
j : 59
k : 56
j + k : 115
j - k : 3
k / j : 0
k * j : 3304
k % j : 56
j %= k : 3
v : 0.5309454
w : 0.0534122
v + w : 0.5843576
v - w : 0.47753322
V * w : 0.028358962
v / w : 9.940527
U += V : 10.471473
u -= v : 9.940527
U *= v : 5.2778773
u /= v : 9.940527 *///:~