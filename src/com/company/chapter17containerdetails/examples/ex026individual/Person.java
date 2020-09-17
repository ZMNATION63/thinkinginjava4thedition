package com.company.chapter17containerdetails.examples.ex026individual;

class Person {
    public final String first;
    public final String last;
    public final String address;

    // etc.
    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    public Person(String first) {
        this.first = first;
        this.last = "";
        this.address = "";
    }

    public String toString() {
        return "Person: " + first + " " + last + " " + address;
    }

    public static class NullPerson extends Person/* implements Null*/ {
        private NullPerson() {
            super("None", "None", "None");
        }

        public String toString() {
            return "NullPerson";
        }
    }

    public static final Person NULL = new NullPerson();
}