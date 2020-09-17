/*
package com.company.Examples.Ex019BankTeller;

//import com.company.Examples.Ex012Generators.Generators;

import java.util.*;

// Очень простая модель кассира
import java.util.*;

import com.company.Examples.Ex04RandomList.RandomList;


class Customer {
    private static long counter = 1;
    private final long id = counter++;
    @Override
    public String toString() {
        return "Customer " + id;
    }
}

class Teller {
    private static long counter = 1;
    private final long id = counter++;
    @Override
    public String toString() {
        return "Teller " + id;
    }
}

class Bank {
    private List<BankTeller> tellers =
            new ArrayList<>();
    public void put(BankTeller bt) {
        tellers.add(bt);
    }
}

public class BankTeller {
    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }
    public static void main(String[] args) {
        // Demonstrate create():
        RandomList<Teller> tellers =
                Generators.create(RandomList::new, Teller::new, 4);
        // Demonstrate fill():
        List<Customer> customers = Generators.fill(new ArrayList<>(), Customer::new, 12);
        customers.forEach(c ->
                serve(tellers.select(), c));
        // Demonstrate assisted latent typing:
        Bank bank = Generators.fill(
                new Bank(), Bank::put, BankTeller::new, 3);
        // Can also use second version of fill():
        List<Customer> customers2 = Generators.fill(
                new ArrayList<>(),
                List::add, Customer::new, 12);
    }
}*/
