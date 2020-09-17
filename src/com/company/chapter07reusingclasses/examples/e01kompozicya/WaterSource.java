package com.company.chapter07reusingclasses.examples.e01kompozicya;

class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "сконструирован";
    }

    public String toString() {
        return s;
    }
}