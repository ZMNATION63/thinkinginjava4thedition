package com.company.chapter11objectcollections.examples.ex09crosscontaineriteration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Обратите внимание: метод display() не содержит информации о типе последовательности. В этом проявляется мощь итераторов: операция перебора элементов последовательности отделяется от базовой структуры этой последовательности. По этой причине
 * иногда говорят, что итераторы унифицируют доступ к контейнерам.
 */
public class CrossContainerIteration {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p.getName() + " ");
//            System.out.print (p.getName ());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = Pet.arrayList(8);
        LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
        HashSet<Pet> petsHS = new HashSet<Pet>(pets);
        //TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        //display(petsTS.iterator());
    }
}
