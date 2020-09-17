package com.company.chapter11objectcollections.examples.ex017kollekciiIIterator;

import java.util.*;

/**
 * Обе версии d i s p l a y ( ) работают с объектами Map, а также подтипами C o l l e c t i o n , причем
 * как интерфейс C o l l e c t i o n , так и I t e r a t o r отделяют методы d i s p l a y ( ) от информации
 * о конкретной реализации используемого контейнера.
 */
public class InterfaceVsIterator {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void display(Collection<Pet> pets) {
        for (Pet p : pets)
            System.out.print(p.id() + ":" + p + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pets> petList = Pets.arrayList(8);
        Set<Pet> petSet = new HashSet<Pet>(petList);
        Map<String, Pet> petMap =
                new LinkedHashMap<String, Pet>();
        String[] names = ("Ralph, Eric, Robin, Lacey, " +
                "Britney, Sam, Spot, Fluffy").split(", ");
        for (int i = 0; i < names.length; i++)
            petMap.put(names[i], petList.get(i));
        //display (petList);
        display(petSet);
        //display (petList.iterator ());
        display(petSet.iterator());
        System.out.println(petMap);
        System.out.println(petMap.keySet());
        display(petMap.values());
        display(petMap.values().iterator());
    }
}