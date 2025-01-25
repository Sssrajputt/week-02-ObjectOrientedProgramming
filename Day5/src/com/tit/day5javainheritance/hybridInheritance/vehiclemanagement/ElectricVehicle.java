package com.tit.day5javainheritance.hybridInheritance.vehiclemanagement;

// Subclass ElectricVehicle inherits Vehicle
class ElectricVehicle extends Vehicle {
    // Constructor to initialize maxSpeed, model, and superclass attributes
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Method to charge the electric vehicle
    void charge() {
        System.out.println("Charging the electric vehicle.");
    }

    // Overriding displayVehicleInfo to include type
    @Override
    void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Type: Electric Vehicle");
    }
}