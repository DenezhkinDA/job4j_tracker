package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иван Петров");
        student.setGroup("23b");
        student.setDate("2021");

        System.out.println(student.getFullName() + " поступил в группу № "
                + student.getGroup() + " в августе " + student.getDate() + " г.");
    }
}
