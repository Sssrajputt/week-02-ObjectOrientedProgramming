package com.tit.day5javainheritance.multilevelInheritance.coursedetails;

class PaidCourse extends OnlineCourse{
    protected int fees;
    protected int discount;
    public PaidCourse(String courseName,String duration,String platform,boolean isRecorded,int fees,int dicount){
        super(courseName,duration,platform,isRecorded);
        this.fees=fees;
        this.discount=discount;
    }
    @Override public void display(){
        super.display();
        System.out.println("Fees of the Course: "+fees);
        System.out.println("Discount of the Course: "+discount);
    }
}