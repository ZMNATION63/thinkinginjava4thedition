package com.company.chapter17containerdetails.tasks.task01;

import com.company.chapter17containerdetails.examples.ex06countries.Countries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 1. ( 1) Создайте контейнер List (опробуйте как ArrayList, так и LinkedList ) и заполните
 * его данными Countries . Отсортируйте список и выведите его, затем многократно
 * примените к списку Collections.shuffle( ) . После каждого применения выводите
 * содержимое контейнера, чтобы было видно, что метод shuffle( ) каждый раз переставляет элементы списка в разном порядке.
 * 2. (2) Создайте контейнеры Мар и Set со всеми странами, названия которых начинаются с буквы «А».
 * 3. ( 1 ) Используя данные Countries , несколько раз заполните контейнер Set одними
 * данными и убедитесь в том, что в Set в конечном итоге каждый экземпляр входит
 * в множество однократно. Попробуйте сделать то же самое с Hashset, LinkedHashSet
 * и TreeSet .
 * 4. (2) Создайте инициализатор Collection , который открывает файл и разбивает его
 * на слова при помощи TextFile , после чего использует слова как источник данных
 * для Collection . Покажите, что ваше решение работает.
 * 5. (3) Измените пример CountingMapData.java и обеспечьте полноценную реализацию
 * паттерна «Легковес»; для этого добавьте класс EntrySet вроде использованного
 * в Countries.java.
 */
public class Task1a {
    public static void main(String[] args) {
        System.out.println("-----------TASK 1-----------");
        List<String> countriesArrayListList = new ArrayList<>();
        List<String> countriesLinkedList = new LinkedList<>();

        countriesArrayListList = Countries.names();
        countriesLinkedList = Countries.names();

        LinkedList<String> countriesLinkedList1 = new LinkedList<>(countriesLinkedList);

        System.out.println("Lists before Collections.shuffle()");
        System.out.println(countriesArrayListList);
        System.out.println(countriesLinkedList1);

        System.out.println("Lists after Collections.shuffle()");
        for (int i = 0; i < 3; i++) {
            Collections.shuffle(countriesArrayListList);
            Collections.shuffle(countriesLinkedList1);

            System.out.println("Itteration with ArrayList  № " + (i + 1) + " " + countriesArrayListList);
            System.out.println("Itteration with LinkedList № " + (i + 1) + " " + countriesLinkedList1);
        }
    }
}
