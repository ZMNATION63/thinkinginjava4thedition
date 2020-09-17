package com.company.chapter16arrays.tasks.task3;

import java.util.Arrays;

/**
 * 5. (1) Продемонстрируйте, что многомерные массивы непримитивных типов автоматически инициализируются null
 */
public class Task5 {
    public static void main(String[] args) {
        int[][] k = new int[3][3];
        System.out.println(Arrays.deepToString(k));
    }
}
