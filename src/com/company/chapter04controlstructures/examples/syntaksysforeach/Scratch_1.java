package com.company.chapter04controlstructures.examples.syntaksysforeach;

import java.util.Random;

class Scratch_1 {
    /**
     * Поле производитель
     */
    public static void main(String[] args) {
        Random rand = new Random(47);
        float f[] = new float[10];
        for (int i = 0; i < 10; i++)
            f[i] = rand.nextFloat();
        for (float x : f)
            System.out.println(x);
        /**
         * for(float x : f)
         * Эта конструкция определяет переменную x типа float, после чего последовательно
         * присваивает ей элементы f
         */

        System.out.println("======");
        for (char c : "An African Swallow".toCharArray())
            System.out.print(c + " ");// c - элемент массива с индексом
        //


    }
}
/* Output:
0.72711575
0.39982635
0.5309454
0.0534122
0.16020656
0.57799757
0.18847865
0.4170137
0.51660204
0.73734957
*///:~
/* Output:
0 1 2 3 4 5 6 7 8 9
5 6 7 8 9
5 8 11 14 17
*///:~