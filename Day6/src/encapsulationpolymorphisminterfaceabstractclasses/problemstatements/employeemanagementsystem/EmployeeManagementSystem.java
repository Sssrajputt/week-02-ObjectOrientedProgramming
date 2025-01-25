package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee(3433, "Harshit", 50000, 20000);
        fte.assignDepartment("Engineering");
        employees.add(fte);

        PartTimeEmployee pte = new PartTimeEmployee(3423, "Gagan", 20000, 20, 50);
        pte.assignDepartment("Sales");
        employees.add(pte);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());
            if (emp instanceof Department) {
                Department dept = (Department) emp;
                System.out.println(dept.getDepartmentDetails());
            }
            System.out.println("---------------------");
            System.out.println();
        }
    }
}
