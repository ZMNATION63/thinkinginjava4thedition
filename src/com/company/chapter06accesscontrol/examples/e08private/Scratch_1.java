package com.company.chapter06accesscontrol.examples.e08private;
/**
 * private может быть очень полезно: предположим, вы хотите контролировать процесс создания
 * объекта, не разрешая посторонним вызывать конкретный конструктор (или любые конструкторы).
 * В данном примере запрещается создавать объекты Sundae с помощью конструктора; вместо этого
 * пользовательдолжен использовать метод makeASundae().
 */

/*
import misha.newpac.Sundae;

class Scratch_1 {
    public static void main(String[] args) {
        //! Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
}*/
