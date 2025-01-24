import java.util.*; // Importing the utility package for using ArrayList

class Employee {
    private String empId; // Employee ID
    private String empName; // Employee Name
    private int salary; // Employee Salary

    // Constructor to initialize the employee's details
    public Employee(String empName, String empId, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Getter method to get the name of the employee
    public String getName() {
        return empName;
    }

    // Getter method to get the ID of the employee
    public String getId() {
        return empId;
    }

    // Getter method to get the salary of the employee
    public int getSalary() {
        return salary;
    }
}

class Department {
    private String deptName; // Department Name
    private String deptId; // Department ID
    private ArrayList<Employee> employees; // List to store employees in the department

    // Constructor to initialize the department's details
    public Department(String deptName, String deptId) {
        this.deptName = deptName;
        this.deptId = deptId;
        this.employees = new ArrayList<>();
    }

    // Getter method to get the name of the department
    public String getName() {
        return deptName;
    }

    // Getter method to get the ID of the department
    public String getId() {
        return deptId;
    }

    // Method to add an employee to the department
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    // Method to display the details of the department and its employees
    public void displayDetails() {
        for (Employee employee : employees) {
            System.out.println("Name of the Employee: \"" + employee.getName() + "\" Id of the Employee: \"" + employee.getId() + "\" Salary of the Employee: \"" + employee.getSalary() + "\"");
        }
        System.out.print("\n");
    }
    public void deleteEmployee(){
        System.out.println("All Employees of the Department is fired");
        employees.clear();
    }
}

class Company {
    public static String companyName = "Capgemini"; // Company Name
    private ArrayList<Department> departments; // List to store departments in the company

    // Constructor to initialize the company's departments list
    public Company() {
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    // Method to display the details of the company and its departments
    public void displayDetails() {
        System.out.println("Name of the Company: " + companyName);
        for (Department department : departments) {
            System.out.println("Name of the Department: \"" + department.getName() + "\" Id of the Department: \"" + department.getId() + "\"");
            System.out.print("\n");
            department.displayDetails();
        }
    }

    // Method to delete all departments from the company
    public void deleteCompany() {
        for (Department department : departments) {
            department.deleteEmployee();
        }
        departments.clear();
        System.out.println("All Departments are Removed");
    }
}

public class CompanyDetails {
    public static void main(String args[]) {
        // Creating employee objects
        Employee gagan = new Employee("Gagan Tantwar", "CT232024", 25000);
        Employee faiz = new Employee("Faiz Khan", "CT242024", 28000);
        Employee aman = new Employee("Aman Khushwaha", "CT252024", 35000);
        Employee akash = new Employee("Akash Chopra", "CT282024", 30000);

        // Creating department objects
        Department IT = new Department("Information Technology", "DT10");
        Department sales = new Department("Marketing", "DT19");

        // Adding employees to departments
        IT.addEmployee(gagan);
        IT.addEmployee(faiz);
        sales.addEmployee(aman);
        sales.addEmployee(akash);

        // Creating company object
        Company capgi = new Company();

        // Adding departments to the company
        capgi.addDepartment(IT);
        capgi.addDepartment(sales);

        // Displaying company details and departments
        capgi.displayDetails();

        // Deleting all departments from the company
        capgi.deleteCompany();
    }
}

