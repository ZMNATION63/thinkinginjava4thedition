package com.company.chapter20annotations.examples.ex04;

import com.company.chapter20annotations.examples.ex01.Test;

import java.util.HashSet;

public class HashSetTest {
    HashSet<String> testObject = new HashSet<String>();

    @Test
    void initialization() {
        assert testObject.isEmpty();
    }

    @Test
    void _contains() {
        testObject.add("one");
        assert testObject.contains("one");
    }

    @Test
    void _remove() {
        testObject.add("one");
        testObject.remove("one");
        assert testObject.isEmpty();
    }

    public static void main(String[] args) throws Exception {
        OSExecute.command("java HashSetTest");
    }
}
