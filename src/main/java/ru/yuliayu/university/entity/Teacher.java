package ru.yuliayu.university.entity;

public class Teacher {
    private String name;
    private int years;
    private String subject;
    private University university;
    private Student student;

    public Teacher() {
    }

    public Teacher(String name, int years, String subject) {
        this.name = name;
        this.years = years;
        this.subject = subject;
    }

    public Teacher(String name, int years, String subject, University university, Student student) {
        this.name = name;
        this.years = years;
        this.subject = subject;
        this.university = university;
        this.student = student;
    }


}
