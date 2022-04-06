package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int resultL = 0;
        int resultR = 0;
        String[] lineLeft = left.split("\\.");
        String[] lineRight = right.split("\\.");
        String lineL = lineLeft[0];
        String lineR = lineRight[0];
        resultL = Integer.parseInt(lineL);
        resultR = Integer.parseInt(lineR);
        return Integer.compare(resultL, resultR);
    }
}
