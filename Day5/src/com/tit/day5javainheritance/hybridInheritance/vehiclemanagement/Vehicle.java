package com.tit.day5javainheritance.hybridInheritance.vehiclemanagement;

// Superclass Vehicle with common attributes maxSpeed and model
class Vehicle {
    private int maxSpeed;
    private String model;

    // Constructor to initialize maxSpeed and model
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display vehicle information
    void displayVehicleInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Model: " + model);
    }
}
