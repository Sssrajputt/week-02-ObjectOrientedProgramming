package com.tit.day5javainheritance.assistedproblems.animalhierarchy;

//creating animal class
class Animal {

    //creating private variables
    private String name;
    private int age;


    // Constructor to set both name and age
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //method to get name
    public String getName() {
        return name;
    }

    //method to get age
    public int getAge() {
        return age;
    }

    //method to makesound
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
