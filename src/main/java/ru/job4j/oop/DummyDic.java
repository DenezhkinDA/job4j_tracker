package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        eng = "Неизвестное слово. + eng";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic dima = new DummyDic();
        String word = dima.engToRus("");
        System.out.println(word);
    }
}
