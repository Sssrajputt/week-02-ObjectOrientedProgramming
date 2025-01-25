package com.tit.day5javainheritance.multilevelInheritance.orderdetails;

class DeliveryOrder extends ShippedOrder{
    protected String deliveryDate;
    public DeliveryOrder(String orderId,String orderDate,int trackingNumber,String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;
    }
    @Override
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Delivery Date Of the Order: "+deliveryDate);
    }
}