package com.tit.day5javainheritance.multilevelInheritance.orderdetails;

public class OrderDetails {
    public static void main(String args[]){
        Order order=new Order("OID521","22-01-2025");
        order.getOrderStatus();;
        System.out.println(" ");
        ShippedOrder shipped=new ShippedOrder("OID521","22-01-2025",12356);
        shipped.getOrderStatus();
        System.out.println(" ");
        DeliveryOrder item2=new DeliveryOrder("OID521","22-01-2025",12356,"24-01-2025");
        item2.getOrderStatus();
    }
}
