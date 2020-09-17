package com.company.chapter03operators.examples.prioritet;

class MainP {
    public static void main(String[] args) {
        //Приоритет стр 97
        prioritet();
    }

    //демонстрация приориттп выполняемых операций
    //Приоритет стр 97
    static void prioritet() {
        int x = 1, у = 2, z = 3; // (1)
        int b = ((x + у + 2) + (2 + z)) / 2; // (2)
        int a = x;
        System.out.println("a = " + a + "\nb = " + b);
    }

}
/* Output x = 5 b = 1
 *///:~