package ru.job4j.tracker;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "Show all times";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all times ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище ещё не содержит заявок");
        }

        return true;
    }
}
