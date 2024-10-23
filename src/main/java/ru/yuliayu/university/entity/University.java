package ru.yuliayu.university.entity;

public class University {
    private String name;
    private int years;
    private Student student;
    private Teacher teacher;

    public University() {
    }

    public University(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public University(String name, int years, Student student, Teacher teacher) {
        this.name = name;
        this.years = years;
        this.student = student;
        this.teacher = teacher;
    }
}
