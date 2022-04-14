package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ComputedFunctionTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = ComputedFunction.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = ComputedFunction.diapason(1, 4, x -> x * x - 1);
        List<Double> expected = Arrays.asList(0D, 3D, 8D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = ComputedFunction.diapason(2, 5, x -> Math.pow(2, x) + 3);
        List<Double> expected = Arrays.asList(7D, 11D, 19D);
        assertThat(result, is(expected));
    }
}
