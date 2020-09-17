package com.company.chapter07reusingclasses.examples.e11protected;

public class Orc extends Villain {
    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        set(name); // Доступно, так как объявлено protected
        this.orcNumber = orcNumber;
    }

    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }
}
