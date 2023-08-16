package com.teachmeskills.hw06.exercise01;

public class ShipСontainer {
    int width;
    int length;
    int depth;
    String containerModel;
    public double cost;


    public ShipСontainer() {
        System.out.println("без параметрами");
        this.width = 10;
        this.length = 20;
        this.depth = 30;
        this.containerModel = "Кастомный контейнер";
    }

    public ShipСontainer(int width, int length, int depth) {
        System.out.println("с параметрами");
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = "Кастомный контейнер";
    }

    public ShipСontainer(int width, int length, int depth, String containerModel) {
        System.out.println("с параметрами + указанная модель");
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = containerModel;
    }

    public ShipСontainer(int width, int length, int depth, String containerModel, double cost) {
        System.out.println("с параметрами + указанная модель + стоимость аренды");
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.containerModel = containerModel;
        this.cost = cost;
    }
}
