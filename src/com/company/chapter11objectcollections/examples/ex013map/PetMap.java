package com.company.chapter11objectcollections.examples.ex013map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PetMap {
    static void print(Map<String, Pet> mapa) {
        Iterator iterator = mapa.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Pet pet = (Pet) entry.getValue();
            System.out.println(entry.getKey() + " " + pet.getName());
        }
    }


    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<String, Pet>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My a Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        print(petMap);
        Pet dog = petMap.get("My Dog");
//        print(dog);
//        print(petMap.containsKey("Му Dog"));
//        print(petMap.containsValue(dog));
    }
}
