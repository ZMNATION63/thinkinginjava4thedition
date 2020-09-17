package com.company.chapter16arrays;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[][] al = {//Автоматическаяупаковка
                {1, 2, 3,},
                {},
                {null, 44},
                {4, 5, 6,},
                {1, 67}
        };
        System.out.println(Arrays.deepToString(al));
//        System.out.println(Arrays.toString(al[2]));
//        System.out.println(al[2][1]);
//        al[2][2] = 333;
//        System.out.println(al[2][2]);
//hdfjkhwjkhfjkhfkj3jhfjk3hf(A[] a) {
        String s = "[";
        for (int i = 0; i < al.length; i++) {
            s = s + "[";
            for (int j = 0; j < al[i].length; j++) {
                s = s + al[i][j];
                if (j != al[i].length - 1) {
                    s = s + ", ";
                }
            }
            s = s + "]";
            if (i != al.length - 1) {
                s = s + ", ";
            }
        }
        System.out.println(s + "]");
    }
}
