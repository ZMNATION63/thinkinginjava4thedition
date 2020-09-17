package com.company.chapter08polymorphism.examples.e01voshodyascheepreobr;

import static com.company.chapter08polymorphism.examples.e01voshodyascheepreobr.Music.*;

/**
 * Интерпретация ссылки на объект как
 * ссылки на базовый тип называется восходящим преобразованием
 * Поскольку мы будем проигрывать с их помощью объекты Note (нота), логично создать
 * эти объекты в отдельном пакете:
 * // Объекты Note для использования с Instrument .
 * <p>
 * Метод Music.tune() получает ссылку на Instrument, но последняя также может указывать
 * на объект любого класса, производного от I n s tr u m e n t. В методе m a in ( ) ссылка на объект
 * wind передается методу t u n e { ) без явных преобразований. Это нормально; интерфейс
 * класса Instrument должен существовать и в классе Wind, поскольку последний был унаследован
 * от Instrument. Восходящее преобразование от Wind к Instrument способно «сузить»
 * этот интерфейс, но не сделает его «меньше», чем полный интерфейс класса Instrument
 * <p>
 * Потеря типоа Объекта
 * Программа работает, но у нее есть огромный недостаток: для каждого нового Instrument
 * приходится писать новый, зависящий от конкретного типа метод tune()
 */
class Scratch_1 {
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Восходящ ее преобразование
        Instrument i = new Instrument();
        tune2(i);
        tune3(flute);
    }
}
