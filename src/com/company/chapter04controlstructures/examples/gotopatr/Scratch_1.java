package com.company.chapter04controlstructures.examples.gotopatr;

/**
 * Важно помнить, что единственная причина для использования MeTOKBjava — наличие
 * вложенных циклов и необходимость выхода по break и продолжения по continue не
 * только для внутренних, но и для внешних циклов
 */
class Scratch_1 {
    public static void main(String[] args) {
        int i = 0;
        outer:
        // Другие команды недопустимы
        for (; true; ) { // infinite loop
            inner:
            // Другие команды недопустимы
            for (; i < 10; i++) {
                System.out.println("i = " + i);
                if (i == 2) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("break");
                    i++; // В противном случае значение i
                    // не увеличивается
                    break;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                    i++; // В противном случае значение i
                    // не увеличивается
                    continue outer;
                }
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
        System.out.println("==============");
        int j = 0;
        outer1:
        while (true) {
            System.out.println("Внешний цикл while");
            while (true) {
                j++;
                System.out.println("i = " + j);
                if (j == 1) {
                    System.out.println("continue");
                    continue;
                }
                if (j == 3) {
                    System.out.println("continue outer");
                    continue outer1;
                }
                if (j == 5) {
                    System.out.println("break");
                    break;
                }
                if (j == 7) {
                    System.out.println("break outer");
                    break outer1;
                }
            }
        }
    }
}


/* Output:
i = 0
continue inner
i = l
continue inner
i = 2
continue
i = 3
break
i ■ 4
continue inner
i = 5
continue inner
i = б
continue inner
i = 7
continue outer
i = 8
break outer
*///:~