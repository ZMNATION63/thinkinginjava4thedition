/*
package com.company.Examples.Ex033CompilerIntelligence;

import com.company.Examples.Ex031CovariantArrays.*;

import java.util.Arrays;
import java.util.List;

public class CompilerIntelligence {
    public static <Apple, Fruit> void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0); // Безчредупреждений
        flist.contains(new Apple()); // Аргумент 'Object'
        flist.indexOf(new Apple()); // Аргумент 'Object'
    }
}*/
