package ru.job4j.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ComputedFunction {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        ArrayList<Double> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            list.add(func.apply((double) i));
        }
        return list;
    }
}
