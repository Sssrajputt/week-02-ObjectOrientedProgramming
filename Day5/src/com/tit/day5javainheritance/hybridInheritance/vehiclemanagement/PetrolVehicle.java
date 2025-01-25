package com.tit.day5javainheritance.hybridInheritance.vehiclemanagement;

// Subclass PetrolVehicle inherits Vehicle and implements Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    // Constructor to initialize maxSpeed, model, and superclass attributes
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Implementation of refuel() for PetrolVehicle
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle.");
    }

    // Overriding displayVehicleInfo to include type
    @Override
    void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Type: Petrol Vehicle");
    }
}