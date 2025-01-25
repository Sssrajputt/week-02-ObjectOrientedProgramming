package com.tit.day5javainheritance.hybridInheritance.restaurantmanagement;

// Superclass Person with common attributes name and id
class Person {
    private String name;
    private int id;

    // Constructor to initialize name and id
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display person information
    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}