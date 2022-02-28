package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int experience;

    public Dentist(String name, String surname, String education, String birthday, String position, int experience) {
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
        Dentist dentist = new Dentist("Илларион", "Сидоров", "Аспирантура", "08.08.1995", "Стажер", 2);
        dentist.printInfo();
    }
}
