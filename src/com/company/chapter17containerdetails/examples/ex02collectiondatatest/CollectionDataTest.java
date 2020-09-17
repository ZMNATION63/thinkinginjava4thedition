package com.company.chapter17containerdetails.examples.ex02collectiondatatest;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>(
                new CollectionData<String>(new Government(), 15));
        // Using the convenience method:
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);
    }
}
