package ru.job4j.tracker.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");
        for (Object result : names) {
            System.out.println(result);
        }
    }
}