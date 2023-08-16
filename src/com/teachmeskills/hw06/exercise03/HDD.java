package com.teachmeskills.hw06.exercise03;

public class HDD {
    private String name;
    private int volume;
    private HDDTypes hddTypes;

    public HDD() {
    }

    public HDD(String name, int volume, HDDTypes type) {
        this.name = name;
        this.volume = volume;
        this.hddTypes = type;
    }

    @Override
    public String toString() {
        return "наименование = '" + name + '\'' +
                "; объём = " + volume +
                "; вид = " + hddTypes.getValue();
    }
}
