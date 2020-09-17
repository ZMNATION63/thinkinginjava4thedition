package com.company.chapter09interfaces.tasks.task05task06task07task08task09task10;

import com.company.chapter09interfaces.tasks.task01.MishasInter;

public class ImplInter implements MishasInter {

    @Override
    public void shows() {
        System.out.println("Интерфейс в другом пакете");
    }

    @Override
    public String mishasInter() {
        return "Стринга из интерфейса";
    }

    @Override
    public void plusplus(int x) {
        System.out.println("Интерфейс ПЛЮС ПЛЮС x = " + (x + x));
    }
}
