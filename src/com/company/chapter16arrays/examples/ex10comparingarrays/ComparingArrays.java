package com.company.chapter16arrays.examples.ex10comparingarrays;

import java.util.Arrays;

public class ComparingArrays {
    public static void main(String[] args) {
        int[] al = new int[10];
        int[] a2 = new int[10];
        Arrays.fill(al, 47);
        Arrays.fill(a2, 47);
        System.out.println(Arrays.equals(al, a2));
        a2[3] = 11;
        System.out.println(Arrays.equals(al, a2));
        String[] sl = new String[4];
        Arrays.fill(sl, "Hi");
        String[] s2 = {new String("Hi"), new String("Hi"),
                new String("Hi"), new String("Hi")};
        System.out.println(Arrays.equals(sl, s2));
    }
}
