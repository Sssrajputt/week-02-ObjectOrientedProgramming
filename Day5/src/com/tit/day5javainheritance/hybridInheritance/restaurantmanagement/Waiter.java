package com.tit.day5javainheritance.hybridInheritance.restaurantmanagement;

// Subclass Waiter inherits Person and implements Worker
class Waiter extends Person implements Worker {
    // Constructor to initialize name, id, and superclass attributes
    Waiter(String name, int id) {
        super(name, id);
    }

    // Implementation of performDuties() for Waiter
    @Override
    public void performDuties() {
        System.out.println("Serving customers.");
    }

    // Overriding displayPersonInfo to include role
    @Override
    void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Role: Waiter");
    }
}
