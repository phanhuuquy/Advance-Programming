package org.example.service;

import org.example.interfaces.Classroom;

public abstract class ClassroomDecorator implements Classroom {
    protected Classroom classroom;

    public ClassroomDecorator(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public void displayClassroom() {
        classroom.displayClassroom();
    }
}