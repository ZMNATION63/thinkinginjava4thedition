package com.company.chapter03operators.examples.operatorysdviga;
//стр112

import java.util.Random;

class OperSdviga {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();
        printBinaryInt("-l", -1);
        printBinaryInt("+l", +1);
        int maxpos = 2147483647;
        printBinaryInt("MaKC. положит.", maxpos);
        int maxneg = -2147483648;
        printBinaryInt("MaKC. отрицат.", maxneg);
        printBinaryInt("i", i);
        printBinaryInt("~i", ~i);
        printBinaryInt("-i", -i);
        printBinaryInt("j", j);
        printBinaryInt("i & j", i & j);
        printBinaryInt("i | j", i | j);
        printBinaryInt("i ^ j", i ^ j);
        printBinaryInt("i << 5", i << 5);
        printBinaryInt("i » 5", i >> 5);
        printBinaryInt("(~i) >> 5", (~i) >> 5);
        printBinaryInt("i >>> 5", i >>> 5);
        printBinaryInt("(~i) > » 5", (~i) >>> 5);
        long l = rand.nextLong();
        long m = rand.nextLong();
        printBinaryLong("-lL", -1L);
        printBinaryLong("+lL", +1L);
        long l1 = 9223372036854775807L;
        printBinaryLong("MaKC. положит.", 11);
        long lln = -9223372036854775808L;
        printBinaryLong("MaKC. отрицат.", lln);
        printBinaryLong("l", 1);
        printBinaryLong("~l", ~1);
        printBinaryLong("-l", -1);
        printBinaryLong("m", m);
        printBinaryLong("1 & m", 1 & m);
        printBinaryLong("1 | m", 1 | m);
        printBinaryLong("1 ^ m", 1 ^ m);
        printBinaryLong("1 « 5", 1 << 5);
        printBinaryLong("1 » 5", 1 >> 5);
        printBinaryLong("(~1 ) » 5", (~1) >> 5);
        printBinaryLong("1 > » 5", 1 >> 5);
        printBinaryLong("(~l) > » 5", (~1) >>> 5);
    }

    static void printBinaryInt(String s, int i) {
        System.out.println(s + ", int: " + i + " двоичное: \n" +
                Integer.toBinaryString(i));
    }

    static void printBinaryLong(String s, long l) {
        System.out.println(s + ", long: " + 1 + ", двоичное: \n" +
                Long.toBinaryString(l));
    }
}