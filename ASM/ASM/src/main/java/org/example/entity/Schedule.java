package org.example.entity;

import org.example.interfaces.Observer;
import org.example.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Schedule implements Subject {
    private int scheduleID;
    private int courseId;
    private int classId;
    private int teacherId;
    private List<Observer> observers;

    public Schedule(int scheduleID, int courseId, int classId, int teacherId) {
        this.scheduleID = scheduleID;
        this.courseId = courseId;
        this.classId = classId;
        this.teacherId = teacherId;
        this.observers = new ArrayList<>();
    }

    public void setNewSchedule(int newScheduleID, int newCourseId, int newClassId, int newTeacherId) {
        this.scheduleID = newScheduleID;
        this.courseId = newCourseId;
        this.classId = newClassId;
        this.teacherId = newTeacherId;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    // Getters and setters

    public int getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(int scheduleID) {
        this.scheduleID = scheduleID;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}