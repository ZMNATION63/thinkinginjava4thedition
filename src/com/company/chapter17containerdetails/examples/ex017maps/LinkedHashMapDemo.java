package com.company.chapter17containerdetails.examples.ex017maps;

//import chapter017podrobneeokonteynerah.examples.ex09countingmapdata.CountingMapData;

import com.company.chapter17containerdetails.examples.ex09countingmapdata.CountingMapData;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<Integer, String>(
                new CountingMapData(9));
        System.out.println(linkedMap);
        // Least-recently-used order:
        linkedMap = new LinkedHashMap<Integer, String>(16, 0.75f, true);
        linkedMap.putAll(new CountingMapData(9));
        System.out.println(linkedMap);
        for (int i = 0; i < 6; i++)
            // Обращение к элементам:
            linkedMap.get(i);
        System.out.println(linkedMap);
        linkedMap.get(0);
        System.out.println(linkedMap);
    }
}