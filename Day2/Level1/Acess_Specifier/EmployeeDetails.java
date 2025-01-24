class Employee {
    // Static variable to store the name of the company (shared among all instances)
    public static String companyName = "Capgemini";
    // Private instance variables to store the employee's name and designation
    private String employeeName;
    private String designation;
    // Final instance variable to store the employee's ID (cannot be changed once assigned)
    private final int id;
    // Static variable to keep track of the total number of employees (shared among all instances)
    private static int totalEmployee = 0;

    // Constructor to initialize the employee's name, ID, and designation
    public Employee(String employeeName, int id, String designation) {
        this.employeeName = employeeName;
        this.id = id;
        this.designation = designation;
        // Increment the total number of employees by 1 whenever a new employee is created
        totalEmployee += 1;
    }

    // Static method to print the total number of employees in the company
    public static void displayTotalEmployees() {
        System.out.println("Total Number of Employees: " + totalEmployee);
    }

    // Method to display the employee details
    public void display() {
        System.out.println("Name of the Employee: " + employeeName);
        System.out.println("ID of the Employee: " + id);
        System.out.println("Designation of the Employee: " + designation);
        System.out.println("Company Name: " + companyName);
    }
}

public class EmployeeDetails {
    public static void main(String args[]) {
        // Creating two instances of Employee with different names, IDs, and designations
        Employee emp1 = new Employee("Gagan Tantwar", 501, "Software Engineer");
        Employee emp2 = new Employee("Shubham Rajput", 502, "Software Engineer");

        // Checking if emp1 is an instance of Employee and displaying its details
        if (emp1 instanceof Employee) {
            System.out.println("emp1 is an instance of Employee");
            emp1.display();
        }
        System.out.print("\n");

        // Checking if emp2 is an instance of Employee and displaying its details
        if (emp2 instanceof Employee) {
            System.out.println("emp2 is an instance of Employee");
            emp2.display();
        }
        System.out.print("\n");

        // Calling the static method to print the total number of employees in the company
        Employee.displayTotalEmployees();
    }
}
