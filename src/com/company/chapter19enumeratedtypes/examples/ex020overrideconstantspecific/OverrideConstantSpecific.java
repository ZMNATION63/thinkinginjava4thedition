package com.company.chapter19enumeratedtypes.examples.ex020overrideconstantspecific;

/**
 * Синтаксис определения методов констант фактически совпадает с синтаксисом анонимных внутренних классов, но оказывается более компактным
 * Как и любое множество, он не содержит дубликатов, так что вызовы add() с одинаковым аргументом игнорируются
 */
public enum OverrideConstantSpecific {
    NUT, BOLT, WASHER {
        void f() {
            System.out.println("Overridden method");
        }
    };

    void f() {
        System.out.println("default behavior");
    }

    public static void main(String[] args) {
        for (OverrideConstantSpecific ocs : values()) {
            System.out.println(ocs + ": ");
            ocs.f();
        }
    }
}