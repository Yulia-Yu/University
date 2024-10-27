package ru.yuliayu.university.entity;

import ru.yuliayu.university.util.DailyGeneralActivity;
import ru.yuliayu.university.util.TeacherActivity;

public class Teacher implements DailyGeneralActivity, TeacherActivity {
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void eat() {
        System.out.println("Пора поесть. Нужно найти кофе.");
    }

    @Override
    public void sleep() {
        System.out.println("Уже час ночи, а я так и не проверил дз. Пойду спать лучше. До сессии есть время.");
    }

    @Override
    public void comeToClass() {
        System.out.println("Черт я преподователь, я не могу пропустить пару. Надеюсь никто не придет.");
    }

    @Override
    public void sick() {
        System.out.println("Я заболел. Надо сходить в больницу, чтобы открыть больничный лист.");
    }

    @Override
    public void submitReport() {
        System.out.println("Закончился семестр. Нужно сдать отчет по успеваемости и посещаемости");
    }

    @Override
    public void attendConference() {
        System.out.println("Снова это совещание. Надеюсь в этот раз скажут что-то интересное.");
    }
}
