package com.company.chapter11objectcollections.tasks.task5task6task7;

import java.util.*;

/**
 * 6. (2) Измените пример ListFeatures.java, чтобы вместо объектов Pet в нем использовались объекты String.
 * Объясните различия в результатах.
 */
public class ListFeaturesSTR {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<String> pets = randomMetod(rand.nextInt(10));
        print("1: ", pets);
//            Hamster h = new Hamster();
        pets.add("999"); // Automatically resizes
        print("2: ", pets);
//            print("3: " + pets.contains(h));
        pets.remove(pets.size() - 1); // Remove by object
        print("3: ", pets);
        String p = pets.get(2);
        print("4: " + p + " " + pets.indexOf(p)); //Порядковый номер по значению эемента
//            Pet cymric = new Cymric();
        print("5: " + pets.indexOf(p));
        print("6: " + pets.remove(pets.indexOf(p)));
//            // Must be the exact object:
//            print("7: " + pets.remove(p));
        print("8: " + pets);
        p = String.valueOf(rand.nextInt(50));
        pets.add(3, p); // Insert at an index
        print("9: " + pets);
        List<String> sub = pets.subList(1, 4);
        print("subList: " + sub);
        print("10: " + pets.containsAll(sub));
        Collections.sort(sub); // In-place sort
        print("sorted subList: " + sub);
//            // Order is not important in containsAll():
        print("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        print("shuffled subList: " + sub);
        print("12: " + pets.containsAll(sub));
        List<String> copy = new ArrayList<String>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        print("sub: " + sub);
        copy.retainAll(sub);
        print("13: " + copy);
        copy = new ArrayList<String>(pets); // Get a fresh copy
        copy.remove(2); // Remove by index
        print("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        print("15: " + copy);
        copy.set(1, String.valueOf(rand.nextInt(10))); // Replace an element
        print("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        print("17: " + copy);
        print("18: " + pets.isEmpty());
        pets.clear(); // Remove all elements
        print("19: " + pets);
        print("20: " + pets.isEmpty());
        pets.addAll(randomMetod(4));
        print("21: " + pets);
        Object[] o = pets.toArray();
        print("22: " + o[3]);
//        Integer[] pa = pets.toArray (new Integer[0]);
//            print("23: " + pa[3].id());

    }

    private static List<String> randomMetod(int rand) {
        List<String> integerList = new ArrayList<>();
        for (int i = 0; i < rand; i++) {
            String n = String.valueOf(new Random().nextInt(500));
            integerList.add(n);
        }
        return integerList;
    }

    private static void print(String s, List<String> integerList) {
        System.out.print(s);
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }
        System.out.println("");
    }

    public static void print(String str) {
        System.out.println(str);
    }

    static void print(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//        System.out.println (list.get (i));
//        Iterator<Object> iterator = integerCollection.iterator ();
//        while (iterator.hasNext ()) {
//            Object item = iterator.next ();
//            System.out.println (item);
//        }
//    System.out.println (s + );
    }
}
