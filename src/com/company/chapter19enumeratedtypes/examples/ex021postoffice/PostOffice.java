package com.company.chapter19enumeratedtypes.examples.ex021postoffice;

import com.company.chapter19enumeratedtypes.examples.ex09enums.Enums;

import java.util.Iterator;

/**
 * Все начинается с описания почтового отправления. Все разные характеристики, учитываемые при обработке,
 * могут быть представлены перечислениями. Так как объекты Mail будут генерироваться случайным образом,
 * для снижения вероятности получить (например) YES в категории GeneralDelivery проще всего создать побольше
 * экземпляров, отличных от YES, так что определения enum на первый взгляд смотрятся немного странно.
 */
public class PostOffice {
    public static void main(String[] args) {
        for (Mail mail : Mail.generator(10)) {
            System.out.println(mail.details());
            handle(mail);
            System.out.println("*****");
        }
    }

    private static void handle(Mail m) {
        MailHandler.GENERAL_DELIVERY.handle(m);
    }

    enum MailHandler {
        GENERAL_DELIVERY {
            boolean handle(Mail m) {
                switch (m.generalDelivery) {
                    case YES:
                        System.out.println("Using general delivery for " + m);
                        return true;
                    default:
                        MACHINE_SCAN.handle(m);
                        return false;
                }
            }
        },
        MACHINE_SCAN {
            boolean handle(Mail m) {
                switch (m.scannability) {
                    case UNSCANNABLE:
                        VISUAL_INSPECTION.handle(m);
                        return false;
                    default:
                        switch (m.address) {
                            case INCORRECT:
                                VISUAL_INSPECTION.handle(m);
                                return false;
                            default:
                                System.out.println("Delivering " + m + " automatically");
                                return true;
                        }
                }
            }
        },
        VISUAL_INSPECTION {
            boolean handle(Mail m) {
                switch (m.readability) {
                    case ILLEGIBLE:
                        RETURN_TO_SENDER.handle(m);
                        return false;
                    default:
                        switch (m.address) {
                            case INCORRECT:
                                RETURN_TO_SENDER.handle(m);
                                return false;
                            default:
                                System.out.println("Delivering " + m + " normally");
                                return true;
                        }
                }
            }
        },
        RETURN_TO_SENDER {
            boolean handle(Mail m) {
                switch (m.returnAddress) {
                    case MISSING:
                        System.out.println(m + " is a dead letter");
                        return false;
                    default:
                        System.out.println("Returning " + m + " to sender");
                        return true;
                }
            }
        };

        abstract boolean handle(Mail m);
    }
}

class Mail {
    private static long counter = 0;

    GeneralDelivery generalDelivery;
    Scannability scannability;
    Readability readability;
    Address address;
    ReturnAddress returnAddress;
    private long id = counter++;

    private static Mail randomMail() {
        Mail m = new Mail();
        m.generalDelivery = Enums.random(GeneralDelivery.class);
        m.scannability = Enums.random(Scannability.class);
        m.readability = Enums.random(Readability.class);
        m.address = Enums.random(Address.class);
        m.returnAddress = Enums.random(ReturnAddress.class);
        return m;
    }

    public static Iterable<Mail> generator(final int count) {
        return new Iterable<Mail>() {
            int n = count;

            public Iterator<Mail> iterator() {
                return new Iterator<Mail>() {
                    @Override
                    public boolean hasNext() {
                        return n-- > 0;
                    }

                    @Override
                    public Mail next() {
                        return randomMail();
                    }
                };
            }
        };
    }

    @Override
    public String toString() {
        return "Mail " + id;
    }

    String details() {
        return toString() +
                ", General Delivery: " + generalDelivery +
                ", Address Scanability: " + scannability +
                ", Address Readability: " + readability +
                ", Address Address: " + address +
                ", Return address: " + returnAddress;
    }

    enum GeneralDelivery {
        YES, NO1, NO2, NO3, NO4, NO5
    }

    enum Scannability {
        UNSCANNABLE, YES1, YES2, YES3, YES4
    }

    enum Readability {
        ILLEGIBLE, YES1, YES2, YES3, YES4
    }

    enum Address {
        INCORRECT, OK1, OK2, OK3, OK4, OK5, OK6
    }

    enum ReturnAddress {
        MISSING, OK1, OK2, OK3, OK4, OK5
    }
}