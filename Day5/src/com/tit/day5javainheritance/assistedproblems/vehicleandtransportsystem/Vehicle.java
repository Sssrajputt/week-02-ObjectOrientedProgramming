package com.tit.day5javainheritance.assistedproblems.vehicleandtransportsystem;

import java.util.ArrayList;
import java.util.List;


//creating vehicle class
class Vehicle {

    //creating variables
    private int maxSpeed;
    private String fuelType;

    //creating a constructor to assign value
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //creating a display function
    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}
