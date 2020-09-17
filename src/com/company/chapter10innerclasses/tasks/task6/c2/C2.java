package com.company.chapter10innerclasses.tasks.task6.c2;

import com.company.chapter10innerclasses.tasks.task6.c1.C1;
import com.company.chapter10innerclasses.tasks.task6.p1.Interface1;

public class C2 extends C1 {
    public Interface1 inter() {
        return makeInner();
    }
}
