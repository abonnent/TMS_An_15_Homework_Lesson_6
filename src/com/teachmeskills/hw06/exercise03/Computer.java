package com.teachmeskills.hw06.exercise03;

public class Computer {
    private double cost;
    private String model;
    private RAM ram;
    private HDD hdd;

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    public Computer(double cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Компьютер {" +
                "цена = " + cost +
                "; модель = '" + model + '\'' +
                "; ОЗУ: " + ram +
                "; ПЗУ: " + hdd +
                '}';
    }
}
