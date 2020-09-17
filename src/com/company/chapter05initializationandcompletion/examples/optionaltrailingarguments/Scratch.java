package com.company.chapter05initializationandcompletion.examples.optionaltrailingarguments;

import static com.company.chapter05initializationandcompletion.examples.optionaltrailingarguments.OptionalTrailingArguments.f;

class OptionalTrailingArguments {
    public static void f(int required, String... trailing) {
        System.out.print("Обязательно: " + required + " ");
        for (String s : trailing)
            System.out.print(s + " ");
        System.out.println();
    }
}

class Scratch {
    public static void main(String[] args) {
        f(1, "один");
        f(new Integer(2), "два", "три");
        f(0);
    }
}