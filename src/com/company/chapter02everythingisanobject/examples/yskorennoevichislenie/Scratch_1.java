package com.company.chapter02everythingisanobject.examples.yskorennoevichislenie;

class Scratch_1 {
    public class ShortCircuit {

    }

    static boolean testl(int val) {
        System.out.println("testl(" + val + ")");
        System.out.println("pe3ynbTaT: " + (val < 1));
        return val < 1;
    }

    static boolean test2(int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("pe3ynbTaT: " + (val < 2));
        return val < 2;
    }

    static boolean test3(int val) {
        System.out.println("test3(" + val + ")");
        System.out.println("pe3ynbTaT: " + (val < 3));
        return val < 3;
    }

    public static void main(String[] args) {
        boolean b = testl(0) && test2(2) && test3(2);
        System.out.println("выражение: " + b);
    }
}
/* Output:
testl(0)
результат: true
test2(2)
результат: false
выражение: false
*///:~