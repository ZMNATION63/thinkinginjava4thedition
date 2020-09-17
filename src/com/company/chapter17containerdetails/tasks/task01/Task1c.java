package com.company.chapter17containerdetails.tasks.task01;

import com.company.chapter17containerdetails.examples.ex06countries.Countries;

import java.util.*;

/**
 * 3. ( 1 ) Используя данные Countries , несколько раз заполните контейнер Set одними
 * данными и убедитесь в том, что в Set в конечном итоге каждый экземпляр входит
 * в множество однократно. Попробуйте сделать то же самое с Hashset, LinkedHashSet
 * и TreeSet .
 */
public class Task1c {
    public static void main(String[] args) {
        List<String> listCountries = Countries.names();
        Set<String> coutriesHashSet = new HashSet<>(listCountries);
        Set<String> coutriesLinkesHashSet = new LinkedHashSet<>(listCountries);
        Set<String> coutriesTreeSet = new TreeSet<>(listCountries);

        System.out.println("Countries List          = " + listCountries);
        System.out.println("Countries HashSet       = " + coutriesHashSet);
        System.out.println("Countries LinkedHashSet = " + coutriesLinkesHashSet);
        System.out.println("Countries TreeSet       = " + coutriesTreeSet);
    }
}
