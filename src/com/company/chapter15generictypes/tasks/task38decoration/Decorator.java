package com.company.chapter15generictypes.tasks.task38decoration;

public class Decorator extends Basic {
    protected Basic basic;

    public Decorator(Basic basic) {
        this.basic = basic;
    }

    public void set(String val) {
        basic.set(val);
    }

    public String get() {
        return basic.get();
    }
}
