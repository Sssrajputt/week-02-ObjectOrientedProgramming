package com.tit.day5javainheritance.multilevelInheritance.orderdetails;

//package MultilevelInheritance;
class  Order{
    protected String orderId;
    protected String orderDate;
    public Order(String orderId,String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }

    public void getOrderStatus(){
        System.out.println("Order Id of the Order: "+orderId);
        System.out.println("Order Date of the Order: "+orderDate);
    }
}