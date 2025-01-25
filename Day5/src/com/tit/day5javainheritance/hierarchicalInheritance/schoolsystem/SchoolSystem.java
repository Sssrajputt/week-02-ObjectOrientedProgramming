package com.tit.day5javainheritance.hierarchicalInheritance.schoolsystem;


// Main class to test the hierarchy
public class SchoolSystem {
    public static void main(String[] args) {
        // Creating a generic person
        Person genericPerson = new Person("John Doe", 30);
        genericPerson.displayRole();
        System.out.println("Name: " + genericPerson.getName());
        System.out.println("Age: " + genericPerson.getAge());
        System.out.println("-----------------");

        // Creating a teacher
        Teacher teacher = new Teacher("Alice Johnson", 40, "Mathematics");
        teacher.displayRole();
        System.out.println("Name: " + teacher.getName());
        System.out.println("Age: " + teacher.getAge());
        System.out.println("Subject: " + teacher.getSubject());
        System.out.println("-----------------");

        // Creating a student
        Student student = new Student("Bob Smith", 16, "10th Grade");
        student.displayRole();
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("-----------------");

        // Creating a staff member
        Staff staff = new Staff("Carol Brown", 35, "Administration");
        staff.displayRole();
        System.out.println("Name: " + staff.getName());
        System.out.println("Age: " + staff.getAge());
        System.out.println("Department: " + staff.getDepartment());
    }
}








