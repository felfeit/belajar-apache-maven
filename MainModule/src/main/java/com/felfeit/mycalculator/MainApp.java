package com.felfeit.mycalculator;

import com.felfeit.newmodule.Person;

public class MainApp {
    public static void main(String[] args) {
        Person person = new Person("Arya");
        System.out.println(person.getName());

        person.setName("Joko");
        System.out.println(person.getName());
    }
}
