package com.company.chapter09interfaces.tasks.task14task15;

public class ClImolInterAll extends RootCl implements InterAll {
    public void met1(Inter1 inter1) {
        System.out.println("Метод Inter1 + адрес объекта ClImolInterAll по ссылке Inter " + inter1.toString());
    }

    public void met2(Inter2 inter1) {
        System.out.println("Метод Inter2 + адрес объекта ClImolInterAll по ссылке Inter " + inter1.toString());
    }

    public void met3(Inter3 inter1) {
        System.out.println("Метод Inter3 + адрес объекта ClImolInterAll по ссылке Inter " + inter1.toString());
    }

    public void met4(InterAll inter1) {
        System.out.println("Метод Inter4 + адрес объекта ClImolInterAll по ссылке Inter " + inter1.toString());
    }


    @Override
    public void inAllMet1() {
        System.out.println("inAllMet1()");
    }

    @Override
    public void in1Met1() {
        System.out.println("in1Met1()");
    }

    @Override
    public void in1Met2() {
        System.out.println("in1Met2()");
    }

    @Override
    public void in2Met1() {
        System.out.println("in2Met1()");
    }

    @Override
    public void in2Met2() {
        System.out.println("in2Met2()");
    }

    @Override
    public void in3Met1() {
        System.out.println("in3Met1()");
    }

    @Override
    public void in3Met2() {
        System.out.println("in3Met2()");
    }
}
