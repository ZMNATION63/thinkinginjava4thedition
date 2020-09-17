package com.company.chapter11objectcollections.examples.ex10listiteration;

import com.company.chapter11objectcollections.examples.ex09crosscontaineriteration.Pet;

import java.util.List;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pet.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        while (it.hasNext())
            System.out.print(it.next() + ", " + it.nextIndex() +
                    ", " + it.previousIndex() + "; ");
        System.out.println();
// В обратном направлении:
        while (it.hasPrevious())
            System.out.print(it.previous().id() + " ");
        System.out.println();
        System.out.println(pets);
        it = pets.listIterator(3);
        while (it.hasNext()) {
            it.next();
            //it.set (Pet.randomPet ());
        }
        System.out.println(pets);
    }
}
