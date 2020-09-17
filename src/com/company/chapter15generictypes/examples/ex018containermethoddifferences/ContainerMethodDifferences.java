package com.company.chapter15generictypes.examples.ex018containermethoddifferences;

import java.lang.reflect.Method;
import java.util.*;

/*
В следующем примере метод Sets.difference() демонстрирует различия в методах различных классов Collection и Мар

 */
public class ContainerMethodDifferences {
    // возвращает в массив стринг список методов класса
    static Set<String> methodSet(Class<?> type) {
        Set<String> result = new TreeSet<String>();
        for (Method m : type.getMethods())
            result.add(m.getName());
        return result;
    }

    //возвращает интерфеймы в классе обобщенного типа
    static void interfaces(Class<?> type) {
        System.out.print("Interfaces in " +
                type.getSimpleName() + ": ");
        List<String> result = new ArrayList<String>();
        for (Class<?> c : type.getInterfaces())
            result.add(c.getSimpleName());
        System.out.println(result);
    }

    static Set<String> object = methodSet(Object.class);

    static {
        object.add("clone");
    }

    //возвращает разницу между массивами методов класса
    static void difference(Class<?> superset, Class<?> subset) {
        System.out.print(superset.getSimpleName() + " extends " + subset.getSimpleName() + ", adds: ");
        Set<String> comp = Sets.difference(methodSet(superset), methodSet(subset));
        comp.removeAll(object); // Не показывать методы 'Object'
        System.out.println(comp);
        interfaces(superset);
    }

    public static void main(String[] args) {
        System.out.println(" Collection:" + methodSet(Collection.class));
        interfaces(Collection.class);
        difference(Set.class, Collection.class);
        difference(HashSet.class, Set.class);
        difference(LinkedHashSet.class, HashSet.class);
        difference(TreeSet.class, Set.class);
        difference(List.class, Collection.class);
        difference(ArrayList.class, List.class);
        difference(LinkedList.class, List.class);
        difference(Queue.class, Collection.class);
        difference(PriorityQueue.class, Queue.class);
        System.out.println("Map: " + methodSet(Map.class));
        difference(HashMap.class, Map.class);
        difference(LinkedHashMap.class, HashMap.class);
        difference(SortedMap.class, Map.class);
        difference(TreeMap.class, Map.class);
    }
}