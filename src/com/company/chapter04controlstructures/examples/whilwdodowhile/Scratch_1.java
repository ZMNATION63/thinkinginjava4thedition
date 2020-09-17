package com.company.chapter04controlstructures.examples.whilwdodowhile;

import static com.company.chapter04controlstructures.examples.whilwdodowhile.WhileTest.condition;

class Scratch_1 {
    public static void main(String[] args) {
        while (condition()) ;
        System.out.println("Inside 'while() {} do'");
        System.out.println("Exited 'while() {} do'");
        System.out.println("=================");
        do {
            System.out.println("Inside ' do {} while() '");
            System.out.println("Exited ' do {} while()'");

        } while (condition());
    }

}