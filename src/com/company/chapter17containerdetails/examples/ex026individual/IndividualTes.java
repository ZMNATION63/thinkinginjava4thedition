package com.company.chapter17containerdetails.examples.ex026individual;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IndividualTes {
    public static void main(String[] args) {
        Set<Individual> pets = new TreeSet<Individual>();
        for (List<? extends Pet> lp :
                MapOfList.petPeople.values())
            for (Pet p : lp)
                pets.add(p);
        System.out.println(pets);
    }
}
