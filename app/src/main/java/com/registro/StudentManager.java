package com.registro;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    // private List students = new ArrayList<>();
    // private List grades = new ArrayList<>();
    private List<Student> students = new ArrayList();

    public void addStudent(String name, double grade) {
        // students.add(s);
        // grades.add(g);
        // System.out.println("Student added.");
        Student student = new Student(name,grade);
        students.add(student);
        System.out.println(student.getName() + student.getGrade());

    }

    public void listStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student: " + students.get(i) + ", Grade: " + grades.get(i));
        }
    }

    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.addStudent("John Doe", 85.5);
        sm.listStudents();
    }
}
