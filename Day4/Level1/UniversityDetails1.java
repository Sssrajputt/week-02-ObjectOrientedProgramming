
import java.util.*;

// Class representing a Faculty member
class Faculty {
    private String facultyName;
    private final String facultyId;

    // Constructor to initialize Faculty object
    public Faculty(String facultyName, String facultyId) {
        this.facultyName = facultyName;
        this.facultyId = facultyId;
    }

    // Getter method for faculty name
    public String getName() {
        return facultyName;
    }

    // Getter method for faculty ID
    public String getId() {
        return facultyId;
    }
}

// Class representing a Department
class Department {
    private String deptName;
    private final String deptId;
    private ArrayList<Faculty> faculties;

    // Constructor to initialize Department object
    public Department(String deptName, String deptId) {
        this.deptName = deptName;
        this.deptId = deptId;
        this.faculties = new ArrayList<>();
    }

    // Getter method for department name
    public String getName() {
        return deptName;
    }

    // Getter method for department ID
    public String getId() {
        return deptId;
    }

    // Method to add a faculty member to the department
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Method to display department details and its faculties
    public void display() {
        System.out.println("Name of the Department: \"" + deptName + "\" Department Id: \"" + deptId + "\"");
        for (Faculty faculty : faculties) {
            System.out.println("Faculty Name: \"" + faculty.getName() + "\" Faculty Id: \"" + faculty.getId() + "\"");
        }
    }
}

// Class representing a University
class University {
    public static String universityName = "RGPV";
    private ArrayList<Department> departments;

    // Constructor to initialize University object
    public University() {
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the university
    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    // Method to display university details and its departments
    public void display() {
        System.out.println("Name of the University: \"" + universityName + "\"");
        for (Department department : departments) {
            department.display();
            System.out.println(" ");
        }
    }

    // Method to delete the university (clear all departments)
    public void deleteUniversity() {
        System.out.println("University Deleted");
        departments.clear();
    }
}

// Main class to demonstrate the functionality
public class UniversityDetails1 {
    public static void main(String args[]) {
        // Creating faculty members
        Faculty vishal = new Faculty("Prof Vishal Singh", "BT5162");
        Faculty vinay = new Faculty("Prof Vinay Raju", "BT5268");
        Faculty vijay = new Faculty("Prof Vijay Shankar", "BT5060");

        System.out.println(" ");

        // Creating departments and adding faculty members to them
        Department aiml = new Department("Artificial Intelligence and Machine Learning", "DT19");
        Department IT = new Department("Information Technology", "DT15");
        aiml.addFaculty(vishal);
        aiml.addFaculty(vinay);

        System.out.println(" ");

        IT.addFaculty(vijay);

        // Creating a university and adding departments to it
        University rgpv = new University();
        rgpv.addDepartment(aiml);
        rgpv.addDepartment(IT);

        System.out.println(" ");

        // Displaying university details
        rgpv.display();

        // Deleting the university
        rgpv.deleteUniversity();
    }
}



