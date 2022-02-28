package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item itemDate = new Item();
        LocalDateTime created = itemDate.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
        String currentDateTimeFormat = created.format(formatter);
        System.out.println("Текущие дата и время: " + currentDateTimeFormat);
    }
}
