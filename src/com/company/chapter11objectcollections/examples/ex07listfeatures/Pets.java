package com.company.chapter11objectcollections.examples.ex07listfeatures;

import java.util.ArrayList;
import java.util.List;

public class Pets {
    public static List<Pets> arrayList(int i) {
        ArrayList<Pets> arrayList = new ArrayList<Pets>();
        for (int j = 0; j < i; j++) {
            arrayList.add(new Pets());
        }
        return arrayList;
    }
}
