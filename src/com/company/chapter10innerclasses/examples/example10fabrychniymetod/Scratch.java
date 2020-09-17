package com.company.chapter10innerclasses.examples.example10fabrychniymetod;

/**
 * Теперь конструкторы Implementationl и Implementation2 могут быть закрытыми,
 * и создавать в качестве фабрики именованный класс уже нет необходимости. Кроме
 * того, часто необходим только один фабричный объект, поэтому в данном примере он
 * создается как статическое поле в реализации Service.
 */
class Scratch {
    public static class Factories {
        public static void serviceConsumer(ServiceFactory fact) {
            Service s = fact.getService();
            s.methodl();
            s.method2();
        }

        public static void main(String[] args) {
            serviceConsumer(Implementationl.factory);
            // Реализации полностью взаимозаменяемы:
            serviceConsumer(Implementation2.factory);
        }
    }
}