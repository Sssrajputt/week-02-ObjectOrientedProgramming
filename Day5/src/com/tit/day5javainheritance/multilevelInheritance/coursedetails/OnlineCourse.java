package com.tit.day5javainheritance.multilevelInheritance.coursedetails;

class OnlineCourse extends Course{
    protected String platform;
    protected boolean isRecorded;
    public OnlineCourse(String courseName,String duration,String platform,boolean isRecorded){
        super(courseName,duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }

    @Override public void display(){
        super.display();
        System.out.println("Platform of the Course: "+platform);
        System.out.println("Course is Recorded: "+isRecorded);
    }
}