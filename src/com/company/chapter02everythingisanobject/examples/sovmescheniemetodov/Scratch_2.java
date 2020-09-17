//: operators/PassObject.java
// Передача объектов методам может работать
// не так, как вы привыкли. Совмещение имен во время вызова методов СТР 93

package com.company.chapter02everythingisanobject.examples.sovmescheniemetodov;

import static com.company.chapter02everythingisanobject.examples.sovmescheniemetodov.PassObject.f;

class Scratch_2 {
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("l: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
    }
}
/* Output
1: x.c: a
2: x.c: z *} ///:~
 */