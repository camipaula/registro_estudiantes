package com.registro;

/**
 * Representa un estudiante con nombre y calificación.
 */
public class Student {

  private String name;
  private double grade;

  /**
   * Constructor de Student.
   * @param name Nombre del estudiante.
   * @param grade Calificación del estudiante.
   */
  public Student(String name, double grade) {
    this.name = name;
    this.grade = grade;
  }

  /**
   * Representación en texto del estudiante.
   * @return Cadena descriptiva del estudiante.
   */
  @Override
  public String toString() {
    return "Student: " + name + ", Grade:" + grade;
  }
}
