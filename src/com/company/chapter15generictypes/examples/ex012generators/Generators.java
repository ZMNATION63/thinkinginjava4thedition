package com.company.chapter15generictypes.examples.ex012generators;

import com.company.chapter15generictypes.examples.ex05generator.Coffee;
import com.company.chapter15generictypes.examples.ex05generator.CoffeeGenerator;
import com.company.chapter15generictypes.examples.ex05generator.Generator;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {
    public static <T> Collection<T>
    fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++)
            coll.add((T) gen.next());
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(
                new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffee)
            System.out.println(c);
//        Collection<Integer> fnumbers = (Collection<Integer>) fill(new ArrayList<Integer>(), new Fibonacci(), 12);
//        for (int i; fnumbers) System.out.print(i + ", ");
    }
}