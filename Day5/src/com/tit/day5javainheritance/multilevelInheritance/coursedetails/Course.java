package com.tit.day5javainheritance.multilevelInheritance.coursedetails;

//package MultilevelInheritance;
class Course{
    protected String courseName;
    protected String duration;
    public Course(String courseName,String duration){
        this.courseName=courseName;
        this.duration=duration;
    }

    public void display(){
        System.out.println("Name of the Course: "+courseName);
        System.out.println("Duration of the Course: "+duration);
    }
}