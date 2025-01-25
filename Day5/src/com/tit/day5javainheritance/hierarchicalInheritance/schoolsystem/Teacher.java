package com.tit.day5javainheritance.hierarchicalInheritance.schoolsystem;

// Subclass for Teacher
class Teacher extends Person {
    private String subject;

    // Constructor to initialize name, age, and subject
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Method to get the subject
    public String getSubject() {
        return subject;
    }

    // Override method to display role
    @Override
    public void displayRole() {
        System.out.println("Teacher");
    }
}