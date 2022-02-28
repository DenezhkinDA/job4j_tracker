package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int experience;

    public Surgeon(String name, String surname, String education, String birthday, String position, int experience) {
        super(name, surname, education, birthday, position);
        this.experience = experience;
    }

    public void printInfo() {
        System.out.println("Имя: " + getName());
        System.out.println("Фамилия: " + getSurname());
        System.out.println("Образование: " + getEducation());
        System.out.println("Дата рождения: " + getBirthday());
        System.out.println("Должность: " + getPosition());
        System.out.println("Стаж: " + experience);
        System.out.println();
    }

    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon("Владимир", "Брульский", "Мугистратура", "03.07.1965", "Зав. отделением", 40);
        surgeon.printInfo();
    }
}
