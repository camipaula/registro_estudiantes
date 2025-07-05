package com.registro;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList();

    public void addStudent(String name, double grade) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío.");
            return;
        }
 
        if (grade < 0 || grade > 100) {
            System.out.println("Error: La nota debe estar entre 0 y 100.");
            return;
        }

        Student student = new Student(name,grade);
        students.add(student);
        System.out.println("Student added");

    }

    public void listStudents() {
        for (Student student : this.students) {
            System.out.println(student.toString());
        }
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent("John Doe", 85.5);
        studentManager.listStudents();
    }
}
