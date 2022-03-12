package ru.job4j.poly;

public class Bus implements Transport {

    private int passengers;
    private double price;

    @Override
    public void drive() {
        System.out.println("Hello, ready to ride?");
    }

    @Override
    public void passengers(int people) {
        this.passengers = people;
    }

    @Override
    public double refuel(double fuel) {
        return fuel * price;
    }
}
