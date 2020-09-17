package com.company.chapter04controlstructures.examples.ifels;

import static com.company.chapter04controlstructures.examples.ifels.Scratch_1.IfElse.test;

//стр 128
class Scratch_1 {

    public static class IfElse {
        public static int result = 0;

        public static void test(int testval, int target) {
            if (testval > target)
                result = +1;
            else if (testval < target)
                result = -1;
            else
                result = 0; // равные числа
        }
    }

    public static void main(String[] args) {
        IfElse r = null;
        test(10, 5);
        System.out.println(r.result);
        test(5, 10);
        System.out.println(r.result);
        test(5, 5);
        System.out.println(r.result);

    }
} /* Output:
1
-1
0
*///:~