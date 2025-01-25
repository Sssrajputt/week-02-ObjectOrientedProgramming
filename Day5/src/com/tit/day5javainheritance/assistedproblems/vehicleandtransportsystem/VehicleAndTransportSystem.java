package com.tit.day5javainheritance.assistedproblems.vehicleandtransportsystem;

import java.util.*;

import java.util.List;

//creating main class
public class VehicleAndTransportSystem {
    public static void main(String[] args) {

        //creating an arraylist to add multiple objects
        List<Vehicle> vehicles = new ArrayList<>();

        System.out.println("");
        System.out.println("Vehicles with their speed,fuelType,and,Capacity: ");
        System.out.println("-----");
        System.out.println("");

        //creating objects of subclasses and adding them to arraylist
        vehicles.add(new Car(180, "Petrol", 5));
        vehicles.add(new Truck(120, "Diesel", 15000));
        vehicles.add(new Motorcycle(160, "Electric", true));

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("-----");
        }
    }
}