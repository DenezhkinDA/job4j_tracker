package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> names = person -> person.getName().contains(key);
        Predicate<Person> surnames = person -> person.getSurname().contains(key);
        Predicate<Person> phones = person -> person.getPhone().contains(key);
        Predicate<Person> addresses = person -> person.getAddress().contains(key);
        Predicate<Person> combine = names.or(surnames).or(phones).or(addresses);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
