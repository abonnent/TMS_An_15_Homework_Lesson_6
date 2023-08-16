package com.teachmeskills.hw06.exercise04;

import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private int Id;
    private String groupName;

    public Student(String name, String surname, int id, String groupName) {
        this.name = name;
        this.surname = surname;
        this.Id = id;
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Ученик {" +
                "имя: '" + name + '\'' +
                ", фамилия: '" + surname + '\'' +
                ", ID: " + Id +
                ", название группы: '" + groupName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Id == student.Id && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(groupName, student.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, Id, groupName);
    }
}
