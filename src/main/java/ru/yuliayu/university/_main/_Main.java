package ru.yuliayu.university._main;

import ru.yuliayu.university.entity.Student;
import ru.yuliayu.university.entity.Teacher;
import ru.yuliayu.university.entity.University;
import ru.yuliayu.university.util.StudentExecutor;
import ru.yuliayu.university.util.TeacherExecutor;

public class _Main {
    public static void main(String[] args) {
        University university = new University("ДВФУ", 1895);
        Teacher teacher = new Teacher("Крестникова Ольга Александровна", 35, "Фундаментальные структуры данных и алгоритмы");
        Student student = new Student("Югалдина Юлия Константиновна", 22, "программная инженерия");
        university.setTeacher(teacher);
        university.setStudent(student);
        teacher.setUniversity(university);
        teacher.setStudent(student);
        student.setTeacher(teacher);
        student.setUniversity(university);
        System.out.println("Студент:");
        StudentExecutor studentExecutor = new StudentExecutor();
        studentExecutor.makeEat(student);
        studentExecutor.makeSleep(student);
        studentExecutor.makeSkipClass(student);
        System.out.println("\nПреподователь:");
        TeacherExecutor teacherExecutor = new TeacherExecutor();
        teacherExecutor.makeEat(teacher);
        teacherExecutor.makeSleep(teacher);
        teacherExecutor.makeSubmitReport(teacher);

    }
}
