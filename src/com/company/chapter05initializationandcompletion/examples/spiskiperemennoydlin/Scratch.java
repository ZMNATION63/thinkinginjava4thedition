package com.company.chapter05initializationandcompletion.examples.spiskiperemennoydlin;

import static com.company.chapter05initializationandcompletion.examples.spiskiperemennoydlin.VarArgs.printArray;

/**
 * Использование синтаксиса массивов
 * для получения переменного списка параметров.
 */
class A {
    int i;
}

class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }
}

class Scratch {
    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47), new Float(3.14), new Double(11.11)
        });

        printArray(new Object[]{"paз", "два", "три"});
        printArray(new Object[]{new A(), new A(), new A()});
    }
}