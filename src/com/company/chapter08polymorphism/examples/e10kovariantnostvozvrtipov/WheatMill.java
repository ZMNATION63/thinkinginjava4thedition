package com.company.chapter08polymorphism.examples.e10kovariantnostvozvrtipov;

public class WheatMill extends Mill {
    Grain process() { //возвращает ссылку на Wheat
        return new Wheat();
    }
}
