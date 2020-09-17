package com.company.chapter08polymorphism.examples.e02poteryatipaobyekta;

import static com.company.chapter08polymorphism.examples.e02poteryatipaobyekta.Biking5.ride;

/**
 * * 5. (1) В упражнении 1 добавьте в класс Cycle метод wheels ( ) , возвращающий количество
 * * колес каждого транспортного средства. Измените метод ride ( ) так, чтобы он
 * * вызывал wheels( ) , и убедитесь в том, что полиморфизм успешно работает.
 */
class Scratch_1 {
    public static void main(String[] args) {

        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u); // upcast to Cycle
        ride(b);
        ride(t);
        Cycle s = new Tricycle();
    }
}
