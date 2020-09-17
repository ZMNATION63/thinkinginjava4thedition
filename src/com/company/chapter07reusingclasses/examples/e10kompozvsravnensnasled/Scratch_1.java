package com.company.chapter07reusingclasses.examples.e10kompozvsravnensnasled;

/**
 * Иногда требуется предоставить пользователю прямой доступ к композиции вашего
 * класса, то есть сделать встроенный объект открытым (public). Встроенные объекты
 * и сами используют сокрытие реализации, поэтому открытый доступ безопасен.
 * Композиция с использованием открытых объектов
 */
class Scratch_1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.service();
    }
}