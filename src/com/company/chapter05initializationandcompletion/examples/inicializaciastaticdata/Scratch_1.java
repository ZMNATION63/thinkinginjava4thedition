package com.company.chapter05initializationandcompletion.examples.inicializaciastaticdata;

// Указание значений по умолчанию в определении класса
class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    void fl(int marker) {
        System.out.println("fl(" + marker + ")");
    }
}

class Table {
    static Bowl bowll = new Bowl(1);

    Table() {
        System.out.println("Table()");
        bowl2.fl(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.fl(2);
    }

    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}

class Scratch {
    public static void main(String[] args) {
        System.out.println("Co3flaHMe нового объекта Cupboard в main()");
        new Cupboard();
        System.out.println("Co3flaHne нового объекта Cupboard в main()");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}