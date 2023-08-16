package com.teachmeskills.hw06.exercise02;

import com.teachmeskills.hw06.exercise01.ShipСontainer;

import java.util.Arrays;

public class Warehouse {
    public String address;
    public ShipСontainer[] containers;

    public Warehouse() {
        this.address = "Amsterdam";
    }

    public Warehouse(String address) {
        this.address = address;
    }

    public Warehouse(String address, ShipСontainer[] containers) {
        this.address = address;
        this.containers = containers;
    }

    public void setContainers(ShipСontainer[] containers) {
        this.containers = containers;

        System.out.println("");
        System.out.println("Добавлено: " + this.containers.length + " контейнера");
        System.out.println("Всего контейнеров: " + this.containers.length);
    }

    public void addContainers(ShipСontainer[] containers) {
        int count = this.containers.length + containers.length;
        ShipСontainer[] temp = new ShipСontainer[count];
        int counter = 0;

        for (int i = 0; i < this.containers.length; i++) {
            temp[i] = this.containers[i];
            counter++;
        }

        for (int j = 0; j < containers.length; j++) {
            temp[counter++] = containers[j];
        }

        this.containers = temp;

        System.out.println("");
        System.out.println("Добавлено: " + containers.length + " контейнера");
        System.out.println("Всего контейнеров: " + this.containers.length);
    }

    public double getTotalPrice() {
        double sum = 0;
        for (int i = 0; i < this.containers.length; i++) {
            sum += this.containers[i].cost;
        }

        return sum;
    }
}
