package com.company.chapter15generictypes.examples.ex02twotuple;

/**
 * 3. (1) Создайте и протестируйте обобщенный тип SixTuple для шести элементов.
 */
class Amphibian {
}

class Vehicle {
}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<String, Integer>("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<Vehicle, Amphibian, String, Integer>(
                new Vehicle(), new Amphibian(), "hi", 47
        );
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(
                new Vehicle(), new Amphibian(), "hi", 47, 11.1
        );
    }

    static SixTuple<Vehicle, Amphibian, String, Integer, Double, String> z() {
        return new SixTuple<Vehicle, Amphibian, String, Integer, Double, String>(
                new Vehicle(), new Amphibian(), "hi", 47, 11.1, "SixTuple, Task3");
        //3. (1) Создайте и протестируйте обобщенный тип SixTuple для шести элементов.
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);

        //  error: cannot assign a value to final variable first
        // ttsi.first = "there";

        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(z());
    }
}



