package com.company.chapter20annotations.examples.ex04;

import com.company.chapter20annotations.examples.ex01.Test;

public class AtUnitComposition {
    AtUnitExample1 testObject = new AtUnitExample1();

    boolean _methodOne() {
        return testObject.methodOne().equals("This is methodOne");
    }

    @Test
    boolean _methodTwo() {
        return testObject.methodTwo() == 2;
    }

    public static void main(String[] args) throws Exception {
        OSExecute.command("java net.mindview.atunit.AtUnit AtUnitComposition1");
    }
}