package com.company.chapter15generictypes.examples.ex015basicgeneratordem;

import com.company.chapter15generictypes.examples.ex14countedobject.CountedObject;
import com.company.chapter15generictypes.tasks.task011.BasicGenerator;

class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen =
                (Generator<CountedObject>) BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());
    }
}
