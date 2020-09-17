package com.company.chapter16arrays.tasks.task3;

import java.util.Random;

public class Task4 {
    static Double[][][] doubleArray(int a, int b, int c) {
        Random r = new Random(47);
        Double[][][] aDouble = new Double[a][b][c];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    aDouble[i][j][k] = r.nextDouble();
                }
            }
        }
        return aDouble;
    }

    //строки столбцы
    static void printDoubleArray(Double[][][] doubles) {

        for (int i = 0; i < doubles.length; i++) {
            String row = "{ ";
            for (int j = 0; j < doubles.length; j++) {
                for (int k = 0; k < doubles.length; k++) {
                    row = row + "[ " + doubles[i][j][k] + " ]" + " ";
                }
            }
            row = row + " }";
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        Double[][][] k = doubleArray(5, 5, 2);
        printDoubleArray(k);
    }
}
