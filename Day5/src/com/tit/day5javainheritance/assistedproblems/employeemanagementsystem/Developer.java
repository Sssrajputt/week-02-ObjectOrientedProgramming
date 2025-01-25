package com.tit.day5javainheritance.assistedproblems.employeemanagementsystem;

class Developer extends Employee{
    private String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // Call the superclass constructor
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails(){
        super.displayDetails(); // Call the superclass method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}