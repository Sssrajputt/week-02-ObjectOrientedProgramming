// Class representing an Employee with fields and methods
class Employee {
    public String employeeID;        // Public: accessible anywhere
    protected String department;     // Protected: accessible within the same package and subclasses
    private double salary;           // Private: accessible only within this class

    // Constructor to initialize Employee details
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to get the salary
    public double getSalary() {
        return salary;
    }

    // Method to modify the salary
    public void modifySalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
            System.out.println("Salary updated successfully to $" + salary);
        } else {
            System.out.println("Invalid salary amount!");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass representing a Manager, inheriting from Employee
class Manager extends Employee {
    private int teamSize;  // Additional field for Manager

    // Constructor to initialize Manager details
    public Manager(String employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary); // Call parent class constructor
        this.teamSize = teamSize;
    }

    // Method to display manager-specific details
    public void displayManagerDetails() {
        displayEmployeeDetails(); // Call parent method to display basic details
        System.out.println("Team Size: " + teamSize);
    }
}

// Main class to test Employee and Manager functionality
public class EmployeeRecords{
    public static void main(String[] args) {
        // Create an Employee instance and initialize it
        Employee emp = new Employee("E123", "Finance", 50000);
        System.out.println("Employee Details:");
        emp.displayEmployeeDetails();

        System.out.println();
        emp.modifySalary(55000); // Modify the salary
        emp.displayEmployeeDetails(); // Display updated employee details

        System.out.println();

        // Create a Manager instance and initialize it
        Manager mgr = new Manager("M456", "IT", 75000, 10);
        System.out.println("Manager Details:");
        mgr.displayManagerDetails();
    }
}
