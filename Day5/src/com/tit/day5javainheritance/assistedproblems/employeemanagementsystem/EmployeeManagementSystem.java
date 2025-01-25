package com.tit.day5javainheritance.assistedproblems.employeemanagementsystem;


public class EmployeeManagementSystem {
    public static void main(String args[]){
        Employee employee = new Employee("Shubham", 2334, 6000000);
        employee.displayDetails();

        Manager manager = new Manager("Gagan", 4343, 700000, 10);
        manager.displayDetails();

        Developer developer = new Developer("Raj", 4653, 500000, "Java");
        developer.displayDetails();

        Intern intern = new Intern("harshit", 5456, 10000, "Computer Science");
        intern.displayDetails();
    }
}
