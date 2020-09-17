package com.company.chapter05initializationandcompletion.examples.peregruzkapovozvrachaemomuznach;

class Bird2 {
    String strBird;

    Bird2() {
        System.out.println("Конструктор по умолчанию класса Bird");
    }

    Bird2(String s) {
        strBird = s;
        System.out.println("Конструктор по умолчанию класса Bird с параметром String");
    }

    Bird2(int i) {
    }

    Bird2(double d) {
    }

}
