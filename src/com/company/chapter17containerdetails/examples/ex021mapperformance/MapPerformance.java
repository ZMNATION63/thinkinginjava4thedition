package com.company.chapter17containerdetails.examples.ex021mapperformance;

import com.company.chapter17containerdetails.examples.ex018listperformance.Test;
import com.company.chapter17containerdetails.examples.ex018listperformance.TestParam;
import com.company.chapter17containerdetails.examples.ex018listperformance.Tester;

import java.util.*;

/**
 * Демонстрация различий производительности
 * в разных реализациях Мар.
 * {Args: 100 5000} Небольшие значения, чтобы тесты
 * не занимали много времени
 */
public class MapPerformance {
    static List<Test<Map<Integer, Integer>>> tests = new ArrayList<Test<Map<Integer, Integer>>>();

    static {
        tests.add(new Test<Map<Integer, Integer>>("put") {
            public int test(Map<Integer, Integer> map, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    map.clear();
                    for (int j = 0; j < size; j++)
                        map.put(j, j);
                }
                return loops * size;
            }
        });

        tests.add(new Test<Map<Integer, Integer>>("get") {
            public int test(Map<Integer, Integer> map, TestParam tp) {
                int loops = tp.loops;
                int span = tp.size * 2;
                for (int i = 0; i < loops; i++)
                    for (int j = 0; j < span; j++)
                        map.get(j);
                return loops * span;
            }
        });

        tests.add(new Test<Map<Integer, Integer>>("iterate") {
            public int test(Map<Integer, Integer> map, TestParam tp) {
                int loops = tp.loops * 10;
                for (int i = 0; i < loops; i++) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext())
                        it.next();
                }
                return loops * map.size();
            }
        });
    }

    public static void main(String[] args) {
        if (args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        Tester.run(new TreeMap<Integer, Integer>(), tests);
        Tester.run(new HashMap<Integer, Integer>(), tests);
        Tester.run(new LinkedHashMap<Integer, Integer>(), tests);
        Tester.run(new IdentityHashMap<Integer, Integer>(), tests);
        Tester.run(new WeakHashMap<Integer, Integer>(), tests);
        Tester.run(new Hashtable<Integer, Integer>(), tests);
    }
}
