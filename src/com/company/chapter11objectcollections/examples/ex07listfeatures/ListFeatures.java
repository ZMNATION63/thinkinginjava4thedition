package com.company.chapter11objectcollections.examples.ex07listfeatures;

import java.util.*;

public class ListFeatures {

    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pets> pets = Pets.arrayList(7);
        System.out.println("l: " + pets);
        Hamster h = new Hamster();
        pets.add(h); // С автоматическим изменением размера
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(h));
        pets.remove(h); // Удаление заданного объекта
        Pets p = pets.get(2);
        System.out.println("4: " + p + " " + pets.indexOf(p));
        Pets cymric = new Cymric();
        System.out.println("5: " + pets.indexOf(cymric));
        System.out.println("6: " + pets.remove(cymric));
// Удаление заданного объекта:
        System.out.println("7: " + pets.remove(p));
        System.out.println("8: " + pets);
        pets.add(3, new Mouse()); // Вставка по индексу
        System.out.println("9: " + pets);
        List<Pets> sub = pets.subList(1, 4);
        System.out.println("Частный список: " + sub);
        System.out.println("10: " + pets.containsAll(sub));
        //Collections.sort(sub); // Сортировка "на месте"
        System.out.println("После сортировки: " + sub);
        // Для containsAll() порядок не важен:
        System.out.println("ll: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand); // Перемешивание
        System.out.println("После перемешивания: " + sub);
        System.out.println("12: " + pets.containsAll(sub));
        List<Pets> copy = new ArrayList<Pets>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<Pets>(pets); // Копирование
        copy.remove(2); // Удаление по индексу
        System.out.println("14: " + copy);
        copy.removeAll(sub); // Удаление заданных объектов
        System.out.println("15: " + copy);
        copy.set(1, new Mouse()); // Замена элемента
        System.out.println("16: " + copy);
        copy.addAll(2, sub); // Вставка списка в середину
        System.out.println("17: " + copy);
        System.out.println("1 8 : " + pets.isEmpty());
        pets.clear(); // Удаление всех элементов
        System.out.println("19: " + pets);
        System.out.println("20: " + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        System.out.println("21: " + pets);
        Object[] o = pets.toArray();
        System.out.println("22:" + pets);
        Pets[] pa = pets.toArray(new Pets[0]);
        //print("23: " + pa[3].id());
    }
}
