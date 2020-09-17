package com.company.chapter13strings.tasks.task6;

public class Ilfd {
    int i = 100500;
    long l = 123456;
    float f = 12344321;
    double d = 123.321;

    @Override
    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(String.format("%05d: ", i);
        String s3 = String.format("| %,10d |", i);
        String s = String.format("| %,d |", l);
        String s1 = String.format("| %,10.3f |", f);
        String s2 = String.format("| %,10.4f |", d);
        return s3 + s + s1 + s2;
    }
}
