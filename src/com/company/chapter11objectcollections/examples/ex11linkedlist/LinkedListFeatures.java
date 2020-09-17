package com.company.chapter11objectcollections.examples.ex11linkedlist;

import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets =
                new LinkedList<Pet>(Pet.arrayList(5));
        System.out.println(pets);

        // Идентично:
        System.out.println("pets.getFirstQ: " + pets.getFirst());
        System.out.println("pets.element(): " + pets.element());

        // Отличается только поведение для пустого списка:
        System.out.println("pets.peek(): " + pets.peek());
        // Идентично; удаление и возвращение первого элемента:
        System.out.println("pets.remove(): " + pets.remove());
        System.out.println("pets.removeFirst(): " + pets.removeFirst());
        // Отличается только поведение для пустого списка:
        System.out.println("pets.poll(): " + pets.poll());
        System.out.println(pets);
//        pets.addFirst(new Rat ());
        System.out.println("Tlocne addFirst(): " + pets);
//                pets.offer(Pet.randomPet());
        System.out.println("Tlocne offer(): " + pets);
//                        pets.add(Pet.randomPet());
        System.out.println("nocne add(): " + pets);
//        pets.addLast(new Hamster ());
        System.out.println("Tlocne addLast(): " + pets);
        System.out.println("pets.removeLast(): " + pets.removeLast());
    }

}
