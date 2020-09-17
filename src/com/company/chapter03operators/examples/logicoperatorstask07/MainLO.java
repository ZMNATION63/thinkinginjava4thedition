/**
 * Операторы сравнений и логические операторы,
 * 7. (3) Напишите программу, моделирующую бросок монетки.
 */
package com.company.chapter03operators.examples.logicoperatorstask07;

import java.util.Random;

class MainLO {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);

        System.out.println("==================================");
        if (i > j) {
            System.out.println("Монетка падает орлом вверх");

        } else {
            if (i == j)
                System.out.println("Монетка падает на ребро");
            else {
                if (i < j) {
                    System.out.println("Монетка падает решко вверх");
                }
            }
        }
        System.out.println("==================================");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i > j = " + (i > j));
        System.out.println("j < j = " + (i < j));
        System.out.println("i >= j = " + (i >= j));
        System.out.println("j <= j = " + (i <= j));
        System.out.println("i == j = " + (i == j));
        System.out.println("j != j = " + (i != j));
// B Dava целое число (int) не может
// интерпретироваться как логический тип (boolean)
//! print("i && 3' is " + (i && j));
//! print("i || j is " + (i || j))j //! print("!i is " + !i);
        System.out.println("(i < 10) && (j < 10) " + ((i < 10) && (j < 10)));
        System.out.println("(i > 10) && (j > 10) " + ((i > 10) && (j > 10)));
        System.out.println("(i < 10) || (j < 10) " + ((i < 10) || (j < 10)));
        System.out.println("(i < 10) || (j < 10) " + ((i > 10) || (j > 10)));

        if ((i < 50) || (j < 50)) {
            System.out.println("Монетка падает Орлом вверх");
        } else {
            if (i == 0 || j == 0)
                System.out.println("Монетка падает на ребро");
            else {
                if ((i > 50) || (j > 50)) {
                    System.out.println("Монетка падает Решко вверх");
                }
            }
        }
    }
}
/* Output: i = 58 j = 55
i > j is true i < j is false i >= j is true i <= j is false i == j is false i != j is true
(i < 10) && (3' < 10) is false (i < 10) 11 (3' < 10) is false
*///:~