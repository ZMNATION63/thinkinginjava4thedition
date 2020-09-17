package com.company.chapter10innerclasses.examples.example016event;

import java.util.ArrayList;
import java.util.List;

/**
 * CNH 313
 * Метод run() циклически просматривает копию eventList в поиске событий Event,
 * которые готовы для выполнения. Для каждого элемента списка, метод ready() которого
 * возвращает true, он распечатывает объект с помощью метода toString(), вызывает
 * метод action(), а после этого удаляет событие из списка
 */
class Scratch {
    public abstract static class Event {
        private long eventTime;
        final long delayTime;


        public Event(long delayTime) {
            this.delayTime = delayTime;
            start();
        }
//        protected Event() {
//        }

        public void start() { // С возможностью перезапуска
            eventTime = System.nanoTime() + delayTime;
        }

        public boolean ready() {
            return System.nanoTime() >= eventTime;
        }

        public abstract void action();
    }

    public static class Controller {
        // Класс из пакета java.util для хранения объектов Event:
        private List<Event> eventList = new ArrayList<Event>();

        public void addEvent(Event c) {
            eventList.add(c);
        }

        public void run() {
            while (eventList.size() > 0)
// Создать копию, чтобы избежать модификации списка
// во время выборки элементов:
                for (Event e : new ArrayList<Event>(eventList))
                    if (e.ready()) {
                        System.out.println(e);
                        e.action();
                        eventList.remove(e);
                    }
        }
    }

//    public static void main(String[] args) {
//        Controller controller = new Controller ();
//        controller.addEvent (new Event (1000) {
//            @Override
//            public void action() {
//                System.out.println ("");
//            }
//        });
//        controller.addEvent (new FastEvent (1000));
//
//    }
}

//class FastEvent extends Scratch.Event{
//
//    public FastEvent(long delayTime) {
//        super (delayTime);
//    }
//
//    @Override
//    public void action() {
//
//    }
//}