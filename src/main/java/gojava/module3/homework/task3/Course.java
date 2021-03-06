package gojava.module3.homework.task3;

import java.util.Date;

public class Course {

    private Date startDate;
    private String name;
    private String teacherName;
    private int hoursDuration;

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
        hoursDuration = 0;
    }

    public Course(int hoursDuration, String name, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.name = name;
        this.teacherName = teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }
}

