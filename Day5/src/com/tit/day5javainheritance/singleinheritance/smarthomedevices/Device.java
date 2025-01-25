package com.tit.day5javainheritance.singleinheritance.smarthomedevices;


class Device {
    private int deviceId;
    private String status;

    Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void display() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Device status: " + status);
    }
}
