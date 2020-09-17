package com.company.chapter14typeinformation.examples.ex07generictoytest;

//import com.company.Examples.Ex03Toys.FancyToy;

import com.company.chapter14typeinformation.examples.ex03toys.FancyToy;

public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
// Создает точный тип:
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
// Не компилируется:
// Class<Toy> up2 = ftClass.getSuperclass();
// Создает только Object:
        Object obj = up.newInstance();
    }
}