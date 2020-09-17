package com.company.chapter15generictypes.examples.ex020ttore;

import java.util.Collection;

public class Generators {
    public static <T> Collection<T>
    fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++)
            coll.add((T) gen.next());
        return coll;
    }
}
