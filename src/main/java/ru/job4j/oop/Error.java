package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Статус чата - активный: " + active);
        System.out.println("Количество пользователей: " + status);
        System.out.println("Тематика чата: " + message);
    }

    public static void main(String[] args) {
        Error firstChat = new Error();
        firstChat.printInfo();
        Error secondChat = new Error(true, 250, "Java!");
        secondChat.printInfo();
        Error thirdChat = new Error(true, 77, "Любовь к рыбалке!");
        thirdChat.printInfo();
    }
}
