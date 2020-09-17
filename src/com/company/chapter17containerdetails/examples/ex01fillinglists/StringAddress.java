package com.company.chapter17containerdetails.examples.ex01fillinglists;

public class StringAddress {
    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    public String toString() {
        return super.toString() + " " + s;
    }
}
