/*
package com.company.chapter11objectcollections.examples.ex08simpleiteration;


import java.util.Iterator;
import java.util.List;

public class Simplelteration {
    public static void main(String[] args) {
        List<Pets> pets = Pets.arrayList(12);
        Iterator<Pets> it = pets.iterator();
        while (it.hasNext()) {
            Pets p = it.next();
            System.out.print(p*/
/*.id() *//*
 + ":" + p + " ");
        }
        System.out.println();
// Более простой синтаксис (там, где возможно):
        for (Pets p : pets)
            System.out.print(p */
/*.id() *//*
 + ":" + p + " ");
        System.out.println();
// Итератор также позволяет удалять элементы:
        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }
}
*/
