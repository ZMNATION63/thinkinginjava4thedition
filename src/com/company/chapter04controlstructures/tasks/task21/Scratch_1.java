package com.company.chapter04controlstructures.tasks.task21;

import java.util.Random;

class Scratch_1 {
    public static void main(String[] args) {
        int i = 0;
        int mas[] = new int[100];
        Random rnd = new Random();
        while (true) {
            mas[i] = rnd.nextInt(100) + 1;
            System.out.println(i + 1 + "-й Элемент массива = " + mas[i]);
            i++;
            if (i == 100) {
                break;
            }
        }
    }
}