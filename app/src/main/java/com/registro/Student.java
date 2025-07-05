package com.registro;

public class Student{
    private String name;
    private double grade;

    public Student(String name, double grade){
        this.name = name;
        this.grade = grade;
    }

    public String getName(){
        return this.name;
    }

    public double getGrade(){
        return this.grade;
    }

    @Override
    public String toString(){
        return "Student: " + name + ", Grade:" + grade;
    }
}