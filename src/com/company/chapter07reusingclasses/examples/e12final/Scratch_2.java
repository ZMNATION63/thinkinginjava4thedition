package com.company.chapter07reusingclasses.examples.e12final;

class Scratch_2 {
    public static void main(String[] args) {
        FinalData fdl = new FinalData("fdl");
        //!fdl.valueOne++;//Ошибка:значениенельзяизменить
        fdl.v2.i++;//Объектнеявляетсянеизменным!
        fdl.vl = new Value(9);//OK-неявляетсянеизменным
        for (int i = 0; i < fdl.a.length; i++)
            fdl.a[i]++;//Объектнеявляетсянеизменным!
        //!fdI.v2=newValue(0);//Ошибка:ссылку
        //!fdl.VAL_3=newValue(l);//нельзяизменить
        //!fdl.a=newint[3];
        System.out.println(fdl);
        System.out.println("Co3flaeMFinal Data");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fdl);
        System.out.println(fd2);
    }
}