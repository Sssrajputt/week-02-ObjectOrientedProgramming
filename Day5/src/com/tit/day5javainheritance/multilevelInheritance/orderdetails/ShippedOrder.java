package com.tit.day5javainheritance.multilevelInheritance.orderdetails;

class ShippedOrder extends Order{
    protected int trackingNumber;
    public ShippedOrder(String orderId,String orderDate,int trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number of the Order: "+trackingNumber);
    }
}