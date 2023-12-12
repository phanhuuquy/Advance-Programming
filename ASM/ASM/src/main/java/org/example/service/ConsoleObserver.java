package org.example.service;

import org.example.entity.Schedule;
import org.example.interfaces.Observer;

public class ConsoleObserver implements Observer {
    @Override
    public void update(Schedule schedule) {
        System.out.println("Schedule updated: " + schedule.getScheduleID() + ", " + schedule.getCourseId() + ", " + schedule.getClassId() + ", " + schedule.getTeacherId());
    }
}
