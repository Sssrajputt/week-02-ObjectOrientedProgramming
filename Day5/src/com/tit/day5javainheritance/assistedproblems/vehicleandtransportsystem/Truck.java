package com.tit.day5javainheritance.assistedproblems.vehicleandtransportsystem;

//creating truck class and inherit vehicle in it
class Truck extends Vehicle {
    private int loadCapacity;

    //creating constructor
    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    //override display method
    @Override
    void displayInfo() {
        System.out.println("Truck: ");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}