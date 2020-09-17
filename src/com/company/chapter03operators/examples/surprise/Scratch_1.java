package com.company.chapter03operators.examples.surprise;

// Сюрприз! В Java возможно переполнение.
class Scratch_1 {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("6onbuioe = " + big);
        int bigger = big * 4;
        System.out.println("eme больше = " + bigger);
    }
}/* Output:
боЛьшое = 2147483647
ещё больше = -4
*///:~

//приина такова, что при достижении максимального значения ява
// начинает переходить на максимальное значение отрицательное и так по кругу