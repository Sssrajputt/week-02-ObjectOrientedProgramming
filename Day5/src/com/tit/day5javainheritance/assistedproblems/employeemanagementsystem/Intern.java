package com.tit.day5javainheritance.assistedproblems.employeemanagementsystem;

class Intern extends Employee{
    private String course;

    Intern(String name, int id, double salary, String course) {
        super(name, id, salary); // Call the superclass constructor
        this.course = course;
    }

    @Override
    void displayDetails(){
        super.displayDetails(); // Call the superclass method
        System.out.println("Course: " + course);
    }
}