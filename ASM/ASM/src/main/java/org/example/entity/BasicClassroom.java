package org.example.entity;

import org.example.interfaces.Classroom;

import java.util.List;

public class BasicClassroom implements Classroom {
    private int classID;
    private String className;
    private int teacherId;
    private int studentCount;
    private List<String> students;

    public BasicClassroom(int classID, String className, int teacherId,
                          int studentCount, List<String> students) {
        this.classID = classID;
        this.className = className;
        this.teacherId = teacherId;
        this.studentCount = studentCount;
        this.students = students;
    }

    @Override
    public void displayClassroom() {
        System.out.println("Class ID: " + classID);
        System.out.println("Class Name: " + className);
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Student Count: " + studentCount);
        System.out.println("Students: " + students);
    }
}