package com.company.chapter11objectcollections.examples.ex11linkedlist;

import java.util.ArrayList;

public class Pet {
    private String name;
    static int globalId;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Pet() {
        globalId++;
        this.id = globalId;
    }

    Pet(String name) {
        this.name = name;
        globalId++;
        this.id = globalId;
    }

    public static ArrayList<Pet> arrayList(int i) {
        ArrayList<Pet> pet = new ArrayList<Pet>();
        pet.add(new Pet("Rat"));
        pet.add(new Pet("Manx"));
        pet.add(new Pet("Cymric"));
        pet.add(new Pet("Mutt"));
        pet.add(new Pet("Pug"));
        pet.add(new Pet("Manx"));
        return pet;
    }

    public int id() {
        return id;
    }
}
