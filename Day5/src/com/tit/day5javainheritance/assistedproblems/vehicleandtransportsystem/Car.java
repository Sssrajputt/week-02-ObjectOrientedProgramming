package com.tit.day5javainheritance.assistedproblems.vehicleandtransportsystem;

class Car extends Vehicle {

    //creating private variable to hide details
    private int seatCapacity;

    //creating a constructor to assign value
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    //override the display function from vehicle class
    @Override
    void displayInfo() {
        System.out.println("Car: ");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}