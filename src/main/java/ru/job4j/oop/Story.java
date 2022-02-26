package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolfik wolf = new Wolfik();
        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
