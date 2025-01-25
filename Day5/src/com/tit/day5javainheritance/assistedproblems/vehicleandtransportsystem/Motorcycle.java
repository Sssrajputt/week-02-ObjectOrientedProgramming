package com.tit.day5javainheritance.assistedproblems.vehicleandtransportsystem;

//creating motorcycle class and inherit from vehicle
class Motorcycle extends Vehicle {

    //declairing variable
    private boolean hasSidecar;

    //creating constructor to assign value
    Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    //overriding the display method
    @Override
    void displayInfo() {
        System.out.println("Motorcycle: ");
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}