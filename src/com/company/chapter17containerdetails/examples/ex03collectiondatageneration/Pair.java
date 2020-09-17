package com.company.chapter17containerdetails.examples.ex03collectiondatageneration;

public class Pair<K, V> {
    public final K key;
    public final V value;

    public Pair(K k, V v) {
        key = k;
        value = v;
    }
}