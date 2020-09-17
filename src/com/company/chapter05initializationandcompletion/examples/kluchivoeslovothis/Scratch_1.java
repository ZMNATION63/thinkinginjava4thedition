package com.company.chapter05initializationandcompletion.examples.kluchivoeslovothis;

/**
 * (1) Создайте класс с двумя методами. В первом методе дважды вызовите второй
 * метод: один раз без ключевого слова this, а во второй с this — просто для того,
 * чтобы убедиться в работоспособности этого синтаксиса; не используйте этот способ
 * вызова на практике.
 */

class Scratch_1 {
    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}