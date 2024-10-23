package ru.yuliayu.university.entity;

public class Student {
    private String name;
    private int years;
    private String directionOfTraining;
    private University university;
    private Teacher teacher;

    public Student() {
    }

    public Student(String name, int years, String directionOfTraining) {
        this.name = name;
        this.years = years;
        this.directionOfTraining = directionOfTraining;
    }

    public Student(String name, int years, String directionOfTraining, University university, Teacher teacher) {
        this.name = name;
        this.years = years;
        this.directionOfTraining = directionOfTraining;
        this.university = university;
        this.teacher = teacher;
    }
}

