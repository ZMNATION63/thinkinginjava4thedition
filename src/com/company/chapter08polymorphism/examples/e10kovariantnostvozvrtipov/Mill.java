package com.company.chapter08polymorphism.examples.e10kovariantnostvozvrtipov;

public class Mill {
    Grain process() {//возвращает ссылку на Grain
        return new Grain();
    }
}
