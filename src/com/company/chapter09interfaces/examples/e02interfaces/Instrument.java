package com.company.chapter09interfaces.examples.e02interfaces;

interface Instrument {
    //Константавременикомпиляции:
    int VALUE = 5;//являетсяиstatic,иfinal

    //Определенияметодовнедопустимы:
    void play(Note n);//Автоматическиобъявленкакpublic

    void adjust();
}
