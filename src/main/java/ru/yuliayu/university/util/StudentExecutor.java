package ru.yuliayu.university.util;

public class StudentExecutor {
    public void makeEat(DailyGeneralActivity dailyGeneralActivity){
        dailyGeneralActivity.eat();
    }

    public void makeSleep(DailyGeneralActivity dailyGeneralActivity){
        dailyGeneralActivity.sleep();
    }

    public void makeSick(DailyGeneralActivity dailyGeneralActivity){
        dailyGeneralActivity.sick();
    }

    public void makeSkipClass(StudentActivity studentActivity){
        studentActivity.skipClass();
    }

    public void makeDoHomework(StudentActivity studentActivity){
        studentActivity.doHomework();
    }
}
