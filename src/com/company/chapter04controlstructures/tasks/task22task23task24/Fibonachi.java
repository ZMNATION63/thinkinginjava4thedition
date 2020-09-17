package com.company.chapter04controlstructures.tasks.task22task23task24;

public class Fibonachi {
    static int f1 = 1;
    static int f2 = 1;

    void fibo(int count) {
        int[] arr = new int[count];
        arr[0] = f1;
        arr[1] = f2;

        for (int i = 0; i < arr.length - 2; i++) {
            arr[i + 2] = arr[i] + arr[i + 1];

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
