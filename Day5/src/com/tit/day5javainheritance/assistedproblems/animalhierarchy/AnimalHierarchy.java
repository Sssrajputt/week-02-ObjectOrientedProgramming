package com.tit.day5javainheritance.assistedproblems.animalhierarchy;

//creating main class
class AnimalHierarchy {
    public static void main(String[] args) {
        System.out.println("-----------------");
        //creating object of animal class
        Animal animal = new Animal("wild", 20);
        animal.makeSound();
        System.out.println("Type: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
        System.out.println("-----------------");
        //creating object of dog class
        Dog dog = new Dog("Tommy", 9);
        dog.makeSound();
        System.out.println("name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("-----------------");
        //creating object of cat class
        Cat cat = new Cat("Meoww", 4);
        cat.makeSound();
        System.out.println("name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("-----------------");
        //creating object of bird class
        Bird bird = new Bird("Swallow", 5);
        bird.makeSound();
        System.out.println("Type: " + bird.getName());
        System.out.println("Age: " + bird.getAge());


    }
}