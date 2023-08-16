package com.teachmeskills.hw06.exercise03;

public class Exercise03 {
    public static void main(String[] args) {
        Computer computer1 = new Computer(32000.0, "model 1");
        String dataComputer1 = computer1.toString();
        System.out.println(dataComputer1);

        RAM ram = new RAM("Samsung", 512);
        HDD hdd = new HDD("LG", 256, HDDTypes.EXTERNAL);
        Computer computer2 = new Computer(48000.0, "model 2", ram, hdd);
        String dataComputer2 = computer2.toString();
        System.out.println(dataComputer2);
    }
}
