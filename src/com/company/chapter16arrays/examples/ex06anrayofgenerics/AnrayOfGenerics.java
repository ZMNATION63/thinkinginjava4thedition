package com.company.chapter16arrays.examples.ex06anrayofgenerics;

import java.util.ArrayList;
import java.util.List;

public class AnrayOfGenerics {

    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];

        //Проблема:List<String>являетсяподтипомObject
        Object[] objects = (List<String>[]) la;//Значит,присваиваниедопустимо

        //Компилируетсяивыполняетсябезошибок:
        objects[1] = new ArrayList<Integer>();

        //Однакоприпростейшихпотребностяхможносоздатьмассив
        // обобщений,хотяис"неконтролируемым"предупреждением:
        List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[]) new List[10];
        for (int i = 0; i < spheres.length; i++)
            spheres[i] = new ArrayList<BerylliumSphere>();

        for (int i = 0; i < spheres.length; i++) {
            System.out.println(spheres[i]);
        }

    }
}
