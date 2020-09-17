package com.company.chapter10innerclasses.examples.example020localInnenclass;

/**
 * Единственная причина использования локального внутреннего класса вместо анонимного внутреннего
 * класса — возможность создания более чем одного объекта такого класса.
 */
class Scratch {
    interface Counter {
        int next();
    }

    public static class LocalInnerClass {
        private int count = 0;

        Counter getCounter(final String name) {
            // Локальный внутренний класс:
            class LocalCounter implements Counter {
                public LocalCounter() {
                    // У локального внутреннего класса
                    // может быть собственный конструктор:
                    System.out.println(" LocalCounter()");
                }

                public int next() {
                    System.out.println(name); // Неизменный аргумент
                    return count++;
                }
            }
            return new LocalCounter();
        }

        // То же с анонимным внутренним классом:
        Counter getCounter2(final String name) {
            return new Counter() {
                // Анонимный внутренний класс не может содержать
                // именованного конструктора, только инициализатор экземпляра
                {
                    System.out.println("Counter()");
                }

                public int next() {
                    System.out.println(name); // Неизменный аргумент
                    return count++;
                }
            };
        }

        public static void main(String[] args) {
            LocalInnerClass lic = new LocalInnerClass();
            Counter
                    cl = lic.getCounter("Локальный "),
                    c2 = lic.getCounter2("Анонимный ");
            for (int i = 0; i < 5; i++)
                System.out.println(cl.next());
            for (int i = 0; i < 5; i++)
                System.out.println(c2.next());
        }
    }
}