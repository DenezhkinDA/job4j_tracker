package ru.job4j.tracker;

import java.sql.Array;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] names = new Item[items.length];
        int num = 0;
        for (int index = 0; index < size; index++) {
            if (key.equals(items[index].getName())) {
                names[num] = items[index];
                num++;
            }
        }
        return Arrays.copyOf(names, num);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index == -1;
        if (rsl) {
            return false;
        }
        System.arraycopy(items, index + 1, items, size - 1, size - index);
        items[size - 1] = null;
        size--;
        return true;
    }
}
