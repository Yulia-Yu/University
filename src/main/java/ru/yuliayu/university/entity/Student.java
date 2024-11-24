package ru.yuliayu.university.entity;

public class Student implements DailyGeneralActivity, StudentActivity {
    private String name;
    private int years;
    private String directionTraining;
    private University university;
    private Teacher teacher;

    public Student() {
    }

    public Student(String name, int years, String directionTraining) {
        this.name = name;
        this.years = years;
        this.directionTraining = directionTraining;
    }

    public Student(String name, int years, String directionTraining, University university, Teacher teacher) {
        this.name = name;
        this.years = years;
        this.directionTraining = directionTraining;
        this.university = university;
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

    public String getDirectionTraining() {
        return directionTraining;
    }

    public void setDirectionTraining(String directionTraining) {
        this.directionTraining = directionTraining;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void eat() {
        System.out.println("Я хочу кушать. Нужно найти еду.");
    }

    @Override
    public void sleep() {
        System.out.println("Уже 5 утра пора ложиться спать.");
    }

    @Override
    public void comeClass() {
        System.out.println("Мой любимый мат анализ, совесть не позволит пропустить эту пару. Последствия слишком критичны.");
    }

    @Override
    public void sick() {
        System.out.println("Я заболел можно поспать");
    }

    @Override
    public void doHomework() {
        System.out.println("Блин, дедлайн был вчера. Наверное уже стоит начать делать это дз.");
    }

    @Override
    public void skipClass() {
        System.out.println("Пара 8.30 - знчит пары нет. Спим дальше.");
    }
}

