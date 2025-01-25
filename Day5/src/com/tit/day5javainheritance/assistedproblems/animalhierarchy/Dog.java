package com.tit.day5javainheritance.assistedproblems.animalhierarchy;

//dog class inherit the property of animal class
class Dog extends Animal {


    // Constructor to set both name and age
    public Dog(String name, int age) {
        //calling throught super keyword variables of animal class
        super(name, age);
    }

    //override makesound method
    @Override
    public void makeSound() {
        System.out.println("Dog barks:");
    }
}