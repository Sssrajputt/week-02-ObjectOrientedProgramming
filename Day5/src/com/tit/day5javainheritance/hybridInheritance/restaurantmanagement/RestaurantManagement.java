package com.tit.day5javainheritance.hybridInheritance.restaurantmanagement;

public class RestaurantManagement {
    public static void main(String[] args) {
        // Testing Chef subclass
        Chef chef = new Chef("Alice", 101);
        chef.displayPersonInfo();
        chef.performDuties();

        System.out.println();

        // Testing Waiter subclass
        Waiter waiter = new Waiter("Bob", 102);
        waiter.displayPersonInfo();
        waiter.performDuties();
    }
}

