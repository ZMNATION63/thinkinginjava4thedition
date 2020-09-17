package com.company.chapter06accesscontrol.tasks.task4task5task6.structure;

public class Transport {
    private int coutn;

    Transport() {
        System.out.println("Отработал конструктор родительского класса Transport");
    }

    public void setCoutn(int coutn) {
        this.coutn = coutn;
    }

    public int getCoutn() {
        return coutn;
    }

    protected void protectedMetod() {
        System.out.println("Protected method of Tranport classes ");
    }

}

class Telega {

}