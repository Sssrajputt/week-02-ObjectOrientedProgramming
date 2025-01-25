package com.tit.day5javainheritance.singleinheritance.smarthomedevices;

class Thermostat extends Device {
    private int temperatureSetting;

    Thermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void display() {
        super.display();
        System.out.println("Device temperature setting: " + temperatureSetting);
    }
}

