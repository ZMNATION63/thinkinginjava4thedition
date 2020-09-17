package com.company.chapter15generictypes.examples.ex013basicgenerator;

/**
 * Генератор общего назначения
 * Следующий класс создает Generator для любого класса, имеющего конструктор по
 * умолчанию. Для сокращения объема кода он также включает обобщенный метод для
 * создания BasicGenerator
 *
 * @param <T>
 */
public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    public T next() {
        try {
// Предполагается, что type - открытый класс:
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Обобщенный метод create() позволяет использовать запись BasicGenerator.create(MyType.class) вместо более громоздкой записи new
     * BasicGenerator<MyType>(MyType.class).
     *
     * @param type
     * @param <T>
     * @return
     */
    // Создание генератора по умолчанию для заданного type:
    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<T>(type);
    }
}
