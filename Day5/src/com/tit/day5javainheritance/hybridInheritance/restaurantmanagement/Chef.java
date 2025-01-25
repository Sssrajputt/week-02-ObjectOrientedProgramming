package com.tit.day5javainheritance.hybridInheritance.restaurantmanagement;

// Subclass Chef inherits Person and implements Worker
class Chef extends Person implements Worker {
    // Constructor to initialize name, id, and superclass attributes
    Chef(String name, int id) {
        super(name, id);
    }

    // Implementation of performDuties() for Chef
    @Override
    public void performDuties() {
        System.out.println("Cooking delicious meals.");
    }

    // Overriding displayPersonInfo to include role
    @Override
    void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Role: Chef");
    }
}
