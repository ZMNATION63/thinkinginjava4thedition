package com.company.chapter17containerdetails.examples.ex02collectiondatatest;

import java.util.ArrayList;

public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++)
            add(gen.next());
    }

    //Обобщенныйвспомогательныйметод:
    public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
        return new CollectionData<T>(gen, quantity);
    }
}