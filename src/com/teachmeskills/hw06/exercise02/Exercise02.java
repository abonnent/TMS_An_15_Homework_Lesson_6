package com.teachmeskills.hw06.exercise02;

import com.teachmeskills.hw06.exercise01.ShipСontainer;

public class Exercise02 {
    public static void main(String[] args) {
        ShipСontainer container1 = new ShipСontainer(4, 4, 8, "Трансконтиненталь", 100.1);
        ShipСontainer container2 = new ShipСontainer(4, 4, 8, "Трансконтиненталь", 110.2);
        ShipСontainer container3 = new ShipСontainer(4, 4, 8, "Трансконтиненталь", 210.7);
        ShipСontainer container4 = new ShipСontainer(4, 4, 8, "Трансконтиненталь", 400.4);

        ShipСontainer[] containers1 = {container1, container2, container3};
        ShipСontainer[] containers2 = {container4};

        Warehouse warehouse = new Warehouse("Санкт-Петербург");
        warehouse.setContainers(containers1);
        warehouse.addContainers(containers2);

        double sum = warehouse.getTotalPrice();
        System.out.println("");
        System.out.println("Суммарная стоимость всех контейнеров равна: " + sum);
    }
}
