package com.company.chapter04controlstructures.tasks.task15task16task17task18task19;

import java.util.Random;

//Вечный цыкл
class WhileTrue {
    public static void main(String[] args) {
        int array[] = new int[25];
        Random rnd = new Random();
        while (true) {
            for (int i = 0; i < 25; i++) {
                array[i] = rnd.nextInt(100);
                System.out.print(array[i] + " ");
            }
            System.out.println("");
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    System.out.println(array[i] + " > " + array[i + 1]);
                } else {
                    if (array[i] == array[i + 1]) {
                        System.out.println(array[i] + " == " + array[i + 1]);
                    } else {
                        System.out.println(array[i] + " < " + array[i + 1]);
                    }
                }
            }
        }
    }
}