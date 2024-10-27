package ru.yuliayu.university.util;

public class TeacherExecutor {
    public void makeEat(DailyGeneralActivity dailyGeneralActivity){
        dailyGeneralActivity.eat();
    }

    public void makeSleep(DailyGeneralActivity dailyGeneralActivity){
        dailyGeneralActivity.sleep();
    }

    public void makeSick(DailyGeneralActivity dailyGeneralActivity){
        dailyGeneralActivity.sick();
    }

    public void makeSubmitReport(TeacherActivity teacherActivity){
        teacherActivity.submitReport();
    }

    public void makeAttendConference(TeacherActivity teacherActivity){
        teacherActivity.attendConference();
    }
}
