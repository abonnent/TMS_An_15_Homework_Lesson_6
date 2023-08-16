package com.teachmeskills.hw06.exercise03;

public enum HDDTypes {
    EXTERNAL("внешний накопитель"),
    INTERNAL("внутренний накопитель");

    private String value;

    HDDTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
