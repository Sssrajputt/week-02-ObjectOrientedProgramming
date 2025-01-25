package com.tit.day5javainheritance.assistedproblems.animalhierarchy;

class Bird extends Animal {

    // Constructor to set both name and age
    public Bird(String name, int age) {
        super(name, age);
    }

    //override makesound method
    @Override
    public void makeSound() {
        System.out.println("Bird chirps:");
    }
}
