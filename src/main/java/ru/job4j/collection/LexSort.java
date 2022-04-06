package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int resultL = 0;
        int resultR = 0;
        String[] lineLeft = left.split("\\.");
        String[] lineRight = right.split("\\.");
        resultL = Integer.parseInt(lineLeft[0]);
        resultR = Integer.parseInt(lineRight[0]);
        return Integer.compare(resultL, resultR);
    }
}
