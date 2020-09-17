package com.company.chapter17containerdetails.examples.ex03collectiondatageneration;

import com.company.chapter17containerdetails.examples.ex02collectiondatatest.CollectionData;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionDataGeneration {
    public static void main(String[] args) {
        System.out.println(new ArrayList<String>(
                CollectionData.list( // Convenience method
                        new RandomGenerator.String(18), 10)));
        System.out.println(new HashSet<Integer>(
                new CollectionData<Integer>(
                        new RandomGenerator.Integer(), 10)));
    }
}
