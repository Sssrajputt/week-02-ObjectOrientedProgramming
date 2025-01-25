package com.tit.day5javainheritance.multilevelInheritance.coursedetails;

public class CourseDetails{
    public static void main(String args[]) {
        Course java1=new Course("Java Fundamentals","3 Months");
        java1.display();;
        System.out.println(" ");
        OnlineCourse java2=new OnlineCourse("Java Fundamentals","3 Months","Durga Technologies",true);
        java2.display();
        System.out.println(" ");
        PaidCourse java = new PaidCourse("Java Fundamentals", "3 Months", "Durga Technologies", true, 5000, 10);
        java.display();
    }
}



