package ru.job4j.tracker;

public class ShowAction implements UserAction {
    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all times";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all times ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Хранилище ещё не содержит заявок");
        }

        return true;
    }
}
