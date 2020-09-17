package com.company.chapter12errorhandlingandexceptions.tasks.task1617;

/**
 * цель - показать, что завершение работает в обратном порядке из блока Finally
 * и память будет освобождена до выхода из программы и высыпания ошибки
 * <p>
 * 17. (3) Измените пример polymorphism/Frog.java, чтобы он использовал tr y - fin a lly для
 * обеспечения необходимых завершающих действий. Покажите, что программа работает даже при возврате
 * из середины try -fin a lly .
 */

class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Характеристика " + s);
    }

    protected void dispose() {
        System.out.println("Метод disposing класс Characteristic, описание " + s);
    }
}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("Конструктор класса Description " + s);
    }

    protected void dispose() {
        System.out.println("Метод disposing класса Description " + s);
    }
}

class LivingCreature {
    private Characteristic p = new Characteristic("Живо!");
    private Description t = new Description("Основа жизни, живое существо");

    LivingCreature() {
        System.out.println("Конструктор LivingCreature() ");
    }

    protected void dispose() {
        System.out.println("LivingCreature мтод dispose");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("Есть сердце");
    private Description t = new Description("Ест МЯСО, Чаще всего мясо пытается убежать");

    Animal() {
        System.out.println("Конструктор класса Animal");
    }

    protected void dispose() {
        System.out.println("Метож dispose класса Animal ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic p = new Characteristic("Способно жить в воде");
    private Description t = new Description("Земноводное");

    Amphibian() {
        System.out.println("Конструктор Amphibian()");
    }

    protected void dispose() {
        System.out.println("Метод  dispose класс Amphibian");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Frog extends Amphibian {
    private Characteristic p = new Characteristic("Квакает");
    private Description t = new Description("Ест насекомых");

    public Frog() {
        System.out.println("Конструктор Frog()");
    }

    protected void dispose() {
        System.out.println("Метод dispose класс Frog ");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        try {
            System.out.println("Возбуждение ошибки");
            throw new RuntimeException();
        } finally {
            System.out.println("Начало блока Finally");
            frog.dispose();
            System.out.println("Конец блока Finally");
        }
    }
}

