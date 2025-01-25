package com.tit.day5javainheritance.singleinheritance.smarthomedevices;

import java.util.*;
public class SmartHomeDevices {
    public static void main(String[] args) {
        System.out.println("");
        Device device = new Device(1324,"warm");
        device.display();
        System.out.println("-------------");
        Thermostat thermo = new Thermostat(3213213, "cool", 20);
        thermo.display();
    }
}

