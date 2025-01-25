package com.tit.day5javainheritance.hierarchicalInheritance.schoolsystem;

// Subclass for Staff
class Staff extends Person {
    private String department;

    // Constructor to initialize name, age, and department
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Method to get the department
    public String getDepartment() {
        return department;
    }

    // Override method to display role
    @Override
    public void displayRole() {
        System.out.println("Staff");
    }
}