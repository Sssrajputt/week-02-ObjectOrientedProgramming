package com.tit.day5javainheritance.hierarchicalInheritance.schoolsystem;

// Subclass for Student
class Student extends Person {
    private String grade;

    // Constructor to initialize name, age, and grade
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Method to get the grade
    public String getGrade() {
        return grade;
    }

    // Override method to display role
    @Override
    public void displayRole() {
        System.out.println("Student");
    }
}
