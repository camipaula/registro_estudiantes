package com.registro;

import com.registro.StudentManager;
import org.junit.Before;
import org.junit.Test;
 
import java.util.List;
 
import static org.junit.Assert.*;

public class StudentManagerTest {
 
    private StudentManager studentManager;
 
    @Before
    public void setUp() {
        studentManager = new StudentManager();
    }
 
    @Test
    public void testAddValidStudent() {
        studentManager.addStudent("Bob", 75.0);
        studentManager.listStudents();
    }
 
    @Test
    public void testAddStudentWithInvalidName() {
        studentManager.addStudent("", 85.0);
        studentManager.listStudents();
    }
 
    @Test
    public void testAddStudentWithInvalidGrade() {
        studentManager.addStudent("Carlos", -5.0);
        studentManager.addStudent("Diana", 110.0);
        studentManager.addStudent("Lucia",8.0);
        studentManager.listStudents();
    }

}