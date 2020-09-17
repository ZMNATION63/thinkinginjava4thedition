package com.company.chapter07reusingclasses.examples.e13pustyekonstanty;

public class BlankFinal {
    private final int i = 0;//Инициализированнаяконстанта
    private final int j;//Пустаяконстанта
    private final Poppet p;//Пустаяконстанта-ссылка

    public int getJ() {
        return j;
    }

    //ПустыеконстантыНЕОБХОДИМОинициализировать
    //вконструкторе:
    public BlankFinal() {
        j = 1;//Инициализацияпустойконстанты
        p = new Poppet(1);//Инициализацияпустойнеизменнойссылки
    }

    public BlankFinal(String z, Integer k) {
        j = k;
        p = new Poppet(k);
        //j = j * 2; //Ругается на попытку изменения финального методда
        System.out.println("В попытке инзменения финальной переменной j = " + j);
        System.out.println("Инициализация финального метода в конструкторе j = " + k);
    }

    public BlankFinal(int x) {
        j = x;//Инициализацияпустойконстанты
        p = new Poppet(x);//Инициализацияпустойнеизменнойссылки
    }
}
