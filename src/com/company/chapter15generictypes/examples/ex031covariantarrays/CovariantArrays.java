package com.company.chapter15generictypes.examples.ex031covariantarrays;

class Fruit {
}

class Apple extends Fruit {
}

class Donathan extends Apple {
}

class Orange extends Fruit {
}

class CovariantArrays {
    public static void main(String[] angs) {
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple(); // 0K
        fruit[1] = new Donathan(); // 0K
        // Тип времени выполнения - Apple[], а не Fruit[] и не Orange[]:
        try {
            // Компилятор позволяет добавить Fruit:
            fruit[0] = new Fruit(); // ArrayStoreException
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            // Компьютер позволяет добавлять Orange:
            fruit[0] = new Orange(); // ArrayStoreException
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

