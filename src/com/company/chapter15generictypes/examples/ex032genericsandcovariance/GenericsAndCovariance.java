package com.company.chapter15generictypes.examples.ex032genericsandcovariance;

/**
 * Однако в некоторых ситуациях между двумя типами желательно установить некую
 * разновидность отношений восходящего преобразования. Для этой цели и используются маски (wildcards).
 */

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
    public static <Fruit, Apple> void main(String[] args) {

        //Маскиобеспечиваютковариантность:
        List<? extends Fruit> flist = (List<? extends Fruit>) new ArrayList<Apple>();

        //Ошибкакомпиляции;добавлениеобъектовневозможно:
        //flist.add(newApple())j
        //flist.add(newFruit());
        //flist.add(newObject());
        flist.add(null);//Допустимо,нонеинтересно

        //Мызнаем,чтовозвращаетсякакминимумFruit:
        Fruit f = flist.get(0);
    }
}