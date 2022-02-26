package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Номер Id: " + id);
        System.out.println("Наименование изделия: " + name);
        System.out.println();
    }

    public static void main(String[] args) {
        Item first = new Item();
        Item second = new Item("Table");
        Item third = new Item(155620, "Window");
        first.printInfo();
        second.printInfo();
        third.printInfo();
    }
}