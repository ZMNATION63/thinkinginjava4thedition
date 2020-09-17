package com.company.chapter17containerdetails.tasks.task01;

import com.company.chapter17containerdetails.examples.ex06countries.Countries;

import java.util.*;

/*2. (2) Создайте контейнеры Мар и Set со всеми странами, названия которых начинаются с буквы «А».*/
public class Task1b {
    public static void main(String[] args) {
        System.out.println("-----------TASK 2-----------");

        Map<String, String> countiesMap = Countries.capitals();
        List<String> countriesSet = Countries.names();
        String tempString = "";

        Set countriesHashSet = new HashSet(countriesSet);

        System.out.println("Countries Set     = " + countriesSet);
        System.out.println("Countries HashSet = " + countriesHashSet);
        System.out.println("Countries Map     = " + countiesMap);

        countriesSet.removeIf(n -> (n.charAt(0) != 'A'));

        Iterator<String> i = countriesHashSet.iterator();
        while (i.hasNext()) {
            tempString = i.next();
            if (tempString.indexOf("A") != 0) {
                i.remove();
            }
        }

//        НЕ нашел почему не смог удалить элемент Map, в то же время отфильтровал его
//        Смог удалить элемент только HashMap
        Map<String, String> copyMapCountries = new HashMap<>(countiesMap);
        Iterator<String> iterator = copyMapCountries.keySet().iterator();
        while (iterator.hasNext()) {
            tempString = iterator.next();
            if (tempString.indexOf("A") != 0) {
                iterator.remove();
            }
        }

        System.out.println("Countries Set     = " + countriesSet);
        System.out.println("Countries HashSet = " + countriesHashSet);
        System.out.println("Countries HashSet = " + copyMapCountries);
    }
}
