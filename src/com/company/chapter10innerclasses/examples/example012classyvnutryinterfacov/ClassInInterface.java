package com.company.chapter10innerclasses.examples.example012classyvnutryinterfacov;

interface ClassInInterface1 {
    void howdy();

    class Test implements ClassInInterface1 {
        public void howdy() {
            System.out.println("ripnBeT!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
