package com.tit.day5javainheritance.assistedproblems.employeemanagementsystem;

class Manager extends Employee {
    private int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // Call the superclass constructor
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails(){
        super.displayDetails(); // Call the superclass method
        System.out.println("Team Size: " + teamSize);
    }
}