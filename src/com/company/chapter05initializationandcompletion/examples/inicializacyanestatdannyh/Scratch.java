package com.company.chapter05initializationandcompletion.examples.inicializacyanestatdannyh;

// "Инициализация экземпляра" в Java.
class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Mugs {
    Mug mugl;
    Mug mug2;

    {
        mugl = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mugl & mug2 инициализированы");
    }

    Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int i) {
        System.out.println("Mugs(int)");
    }
}

class Scratch {
    public static void main(String[] args) {
        System.out.println("B методе main()");
        new Mugs();
        System.out.println("new Mugs() завершено");
        new Mugs(1);
        System.out.println("new Mugs(l) завершено");
    }
}