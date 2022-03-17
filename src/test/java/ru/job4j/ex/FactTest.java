package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLessThen0() {
        Fact.calc(-1);
    }

    @Test
    public void whenN2thenMinus2() {
        int rsl = Fact.calc(2);
        assertThat(rsl, is(-2));
    }
}
