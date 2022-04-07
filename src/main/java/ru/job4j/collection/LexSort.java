package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] lineLeft = left.split("\\.");
        String[] lineRight = right.split("\\.");
        int resultL = Integer.parseInt(lineLeft[0]);
        int resultR = Integer.parseInt(lineRight[0]);
        return Integer.compare(resultL, resultR);
    }
}
