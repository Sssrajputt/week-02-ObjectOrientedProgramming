package com.tit.day5javainheritance.hierarchicalInheritance.schoolsystem;


// Superclass for Person
class Person {
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to get the name
    public String getName() {
        return name;
    }

    // Method to get the age
    public int getAge() {
        return age;
    }

    // Placeholder method to display role
    public void displayRole() {
        System.out.println("Generic Person");
    }
}
