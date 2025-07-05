package com.registro;

/**
 * Clase principal para ejecutar el registro de estudiantes.
 */
public class Main {

  /**
   * Método principal.
   * @param args Argumentos de línea de comandos.
   */
  public static void main(String[] args) {
    StudentManager studentManager = new StudentManager();
    studentManager.addStudent("John Doe", 85.5);
    studentManager.listStudents();
  }
}
