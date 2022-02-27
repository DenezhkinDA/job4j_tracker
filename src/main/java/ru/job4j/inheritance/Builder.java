package ru.job4j.inheritance;

public class Builder extends Engineer {

    private int experience;

    public Builder() {
    }

    public Builder(String name, String surname, String education, String birthday, String position, int experience) {
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
        Builder builder = new Builder("Павел", "Павлов", "Среднее специальное", "07.04.1985", "Штукатур", 3);
        builder.printInfo();
    }
}
