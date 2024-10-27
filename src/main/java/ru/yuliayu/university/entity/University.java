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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
