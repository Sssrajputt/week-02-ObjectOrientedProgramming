package com.tit.day5javainheritance.hybridInheritance.vehiclemanagement;

public class VehicleManagement {
    public static void main(String[] args) {
        // Testing ElectricVehicle subclass
        ElectricVehicle electricCar = new ElectricVehicle(150, "Tesla Model S");
        electricCar.displayVehicleInfo();
        electricCar.charge();

        System.out.println();

        // Testing PetrolVehicle subclass
        PetrolVehicle petrolCar = new PetrolVehicle(200, "Ford Mustang");
        petrolCar.displayVehicleInfo();
        petrolCar.refuel();
    }
}
