package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void sortDescByName() {
        List<Item> items = Arrays.asList(
                new Item("Jazz"),
                new Item("Pop"),
                new Item("Rock"),
                new Item("Blues")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("Rock"),
                new Item("Pop"),
                new Item("Jazz"),
                new Item("Blues")
        );
        assertThat(items.toString(), is(expected.toString()));
    }

}