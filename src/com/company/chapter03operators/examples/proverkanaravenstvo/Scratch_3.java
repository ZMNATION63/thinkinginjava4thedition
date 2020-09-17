package com.company.chapter03operators.examples.proverkanaravenstvo;

class Scratch_3 {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.print("n1 == n2: ");
        System.out.println(n1 == n2);
        System.out.print("n1 = n2: ");
        System.out.println(n1 != n2);
        System.out.println("n1.equals(n2): " + n1.equals(n2));

        //если создать класс и не переопределить equals - этот метод будет сравнивать ссылки и ответ бдудет false
    }
}
/* Output:
false
true
true
*///:~