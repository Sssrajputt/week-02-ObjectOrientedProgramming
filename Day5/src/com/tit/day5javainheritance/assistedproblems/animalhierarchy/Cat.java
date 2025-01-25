package com.tit.day5javainheritance.assistedproblems.animalhierarchy;

class Cat extends Animal {

    // Constructor to set both name and age
    public Cat(String name, int age) {
        super(name, age);
    }

    //override makesound method
    @Override
    public void makeSound() {
        System.out.println("Cat meows:");
    }
}
