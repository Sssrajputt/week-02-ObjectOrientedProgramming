import java.util.*;
import java.lang.*;
// Creating Employee class 
class Employee {

    // Creating attributes name, id, and salary
    String name;
    String id;
    Double salary;

    // Making a constructor to initialize data
    public Employee(String name, String id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee salary: " + salary);
    }
}

// Creating Main class
public class MainEmployee {
    public static void main(String args[]) {

        // Creating Employee class object
        Employee employee = new Employee("Shubham", "O199AL", 50000.0);
        employee.display();
    }
}
