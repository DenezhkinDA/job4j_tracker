package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition() {
        this.position = position;
    }

    public Doctor() {
    }

    public Doctor(String name, String surname, String education, String birthday, String position) {
        super(name, surname, education, birthday);
        this.position = position;
    }
}
