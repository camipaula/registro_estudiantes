package com.registro;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona el registro de estudiantes.
 */
public class StudentManager {

  private List<Student> students = new ArrayList<>();

  /**
   * Agrega un nuevo estudiante al registro.
   * @param name Nombre del estudiante.
   * @param grade Calificación del estudiante.
   */
  public void addStudent(String name, double grade) {
    if (name == null || name.trim().isEmpty()) {
      System.out.println("Error: El nombre no puede estar vacío.");
      return;
    }

    if (grade < 0 || grade > 100) {
      System.out.println("Error: La nota debe estar entre 0 y 100.");
      return;
    }

    Student student = new Student(name, grade);
    students.add(student);
    System.out.println("Student added");
  }

  /**
   * Muestra la lista de estudiantes registrados.
   */
  public void listStudents() {
    for (Student student : this.students) {
      System.out.println(student.toString());
    }
  }
}
