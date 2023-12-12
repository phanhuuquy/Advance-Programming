package org.example;

import org.example.entity.BasicClassroom;
import org.example.entity.Schedule;
import org.example.entity.Student;
import org.example.entity.Teacher;
import org.example.interfaces.Classroom;
import org.example.interfaces.NotifyInterface;
import org.example.interfaces.UpdateInfoRequest;
import org.example.service.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Insert teacher =========Singleton - Creation======================================
        Teacher teacher = new Teacher(1,"Dinh Van Dong");
        TeacherService.getInstance().insert(teacher);
        // Factory Method == Creational Pattern
        NotifyInterface notifyStudent = AccountFactory.createNotification("Student");
        notifyStudent.notification();

        NotifyInterface notifyTeacher = AccountFactory.createNotification("Teacher");
        notifyTeacher.notification();

        NotifyInterface notifyParent = AccountFactory.createNotification("Parent");
        notifyParent.notification();
        //=========================================================================



        // Iterator ============Behavior ====================================================

        Student student1 = new Student(1,"An");
        Student student2 = new Student(2, "Binh");
        Student student3 = new Student(3,"Nam");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.toString());
        }
        //===Observer pattern
        Schedule schedule = new Schedule(1, 101, 201, 301);

        ConsoleObserver observer1 = new ConsoleObserver();
        ConsoleObserver observer2 = new ConsoleObserver();

        schedule.registerObserver(observer1);
        schedule.registerObserver(observer2);

        schedule.setNewSchedule(2, 102, 202, 302);

        schedule.removeObserver(observer2);

        schedule.setNewSchedule(3, 103, 203, 303);


        //===Decorator Pattern============
        int classID = 1;
        String className = "Math";
        int teacherId = 101;
        int studentCount = 20;
        List<String> students = new ArrayList<>();
        students.add("John");
        students.add("Alice");

        Classroom basicClassroom = new BasicClassroom(classID, className, teacherId, studentCount, students);
        Classroom decoratedClassroom = new ClassroomDetailsDecorator(new ClassroomOccupancyDecorator(basicClassroom));
        decoratedClassroom.displayClassroom();

        //===================================================================================
       // Adapter ========Structural Pattern
        UpdateInfoRequest updateInfoRequest = new AdminService(TeacherService.getInstance());
        updateInfoRequest.updateInfoTeacher(teacher);

        //===================================================================================


        //Facade == Structural Pattern

        FacadeService facadeService = new FacadeService();
        facadeService.operationDeleteTeacher(1);


    }
}