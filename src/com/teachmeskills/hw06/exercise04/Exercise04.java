package com.teachmeskills.hw06.exercise04;

public class Exercise04 {
    public static void main(String[] args) {
        Student student1 = new Student("Роман", "Белов", 1407482997, "and15");
        Student student2 = new Student("Роман", "Белов", 1407482997, "and15");

        System.out.println(student1.toString());

        if (student1.equals(student2)){
            System.out.println("Данные совпадают");
        } else {
            System.out.println("Данные не совпадают");
        }

    }
}
