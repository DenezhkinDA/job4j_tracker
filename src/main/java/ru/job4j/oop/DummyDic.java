package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dima = new DummyDic();
        String word = dima.engToRus("mrak");
        System.out.println(word);
    }
}
