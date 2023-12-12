package org.example.service;

import org.example.interfaces.Classroom;

public class ClassroomDetailsDecorator extends ClassroomDecorator {
    public ClassroomDetailsDecorator(Classroom classroom) {
        super(classroom);
    }

    @Override
    public void displayClassroom() {
        super.displayClassroom();
        System.out.println("This classroom has additional details.");
        // Add code here to display additional details.
    }
}