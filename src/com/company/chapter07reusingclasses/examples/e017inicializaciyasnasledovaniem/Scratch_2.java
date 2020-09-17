package com.company.chapter07reusingclasses.examples.e017inicializaciyasnasledovaniem;

/**
 * Запуск класса B e e t le Bjava начинается с выполнения метода B e e t le .m a in ( ) (статического),
 * поэтому загрузчик пытается найти скомпилированный код класса B e e t le (он должен
 * находиться в файле Beetle.class). При этом загрузчик обнаруживает, что у класса имеется
 * базовый класс (о чем говорит ключевое слово e x t e n d s ) , который затем и загружается.
 */
class Scratch_2 {
    public static void main(String[] args) {
        System.out.println("KoHCTpyxTopBeetle");
        Beetle b = new Beetle();
    }
}