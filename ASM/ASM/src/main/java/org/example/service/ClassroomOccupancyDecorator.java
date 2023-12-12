package org.example.service;

import org.example.interfaces.Classroom;

public class ClassroomOccupancyDecorator extends ClassroomDecorator {
    public ClassroomOccupancyDecorator(Classroom classroom) {
        super(classroom);
    }

    @Override
    public void displayClassroom() {
        super.displayClassroom();
        System.out.println("This classroom has occupancy information.");
        // Add code here to display occupancy information.
    }
}
