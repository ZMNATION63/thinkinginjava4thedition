/*
package com.company.chapter11objectcollections.examples.ex018collectionsequence;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Spliterator;

public class CollectionSequence extends AbstractCollection<Pet> {
    @Override
    public Spliterator<Pet> spliterator() {
        return null;
    }

    private Pet[] pets = Pets.createArray(8);

    public int size() {
        return pets.length;
    }

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            public boolean hasNext() {
                return index < pets.length;
            }

            public Pet next() {
                return pets[index++];
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
//        CollectionSequence c = new CollectionSequence();
//        InterfaceVsIterator.display(c);
//        InterfaceVsIterator.display(c.iterator());
    }
}*/
