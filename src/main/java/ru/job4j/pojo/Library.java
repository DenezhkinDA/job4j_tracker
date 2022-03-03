package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book pinocchio = new Book("Pinocchio", 185);
        Book ognivo = new Book("Ognivo", 155);
        Book konyaga = new Book("Konyaga", 177);
        Book cleanCode = new Book("Clean Code", 77);
        Book[] bks = new Book[4];
        bks[0] = pinocchio;
        bks[1] = ognivo;
        bks[2] = konyaga;
        bks[3] = cleanCode;
        for (int index = 0; index < bks.length; index++) {
            Book bk = bks[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Swap positions 0 and 3.");
        bks[0] = cleanCode;
        bks[3] = pinocchio;
        for (int index = 0; index < bks.length; index++) {
            Book bk = bks[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Only book Clean Code");
        for (int index = 0; index < bks.length; index++) {
            Book bk = bks[index];
            if ("Clean Code".equals(bk.getName())) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}
