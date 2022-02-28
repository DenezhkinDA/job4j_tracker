package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private int experience;

    public Programmer(String name, String surname, String education, String birthday, String position, int experience) {
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
        Programmer programmer = new Programmer("Иван", "Иванов", "Высшее специальное", "01.02.1975", "Начальник отдела", 5);
        programmer.printInfo();
    }
}
