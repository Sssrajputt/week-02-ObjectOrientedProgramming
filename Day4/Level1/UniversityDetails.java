import java.util.*;

// Class representing a Faculty member
class Faculty {
    private String lecturerName;
    private final String lecturerId;

    // Constructor to initialize Faculty object
    public Faculty(String lecturerName, String lecturerId) {
        this.lecturerName = lecturerName;
        this.lecturerId = lecturerId;
    }

    // Getter method for lecturer name
    public String getName() {
        return lecturerName;
    }

    // Getter method for lecturer ID
    public String getId() {
        return lecturerId;
    }
}

// Class representing a Department
class Department {
    private String divisionName;
    private final String divisionId;
    private ArrayList<Faculty> lecturers;

    // Constructor to initialize Department object
    public Department(String divisionName, String divisionId) {
        this.divisionName = divisionName;
        this.divisionId = divisionId;
        this.lecturers = new ArrayList<>();
    }

    // Getter method for division name
    public String getName() {
        return divisionName;
    }

    // Getter method for division ID
    public String getId() {
        return divisionId;
    }

    // Method to add a lecturer to the division
    public void addFaculty(Faculty lecturer) {
        lecturers.add(lecturer);
    }

    // Method to display division details and its lecturers
    public void display() {
        System.out.println("Name of the Division: \"" + divisionName + "\" Division Id: \"" + divisionId + "\"");
        for (Faculty lecturer : lecturers) {
            System.out.println("Lecturer Name: \"" + lecturer.getName() + "\" Lecturer Id: \"" + lecturer.getId() + "\"");
        }
    }
}

// Class representing a University
class University {
    public static String institutionName = "NIT";
    private ArrayList<Department> divisions;

    // Constructor to initialize University object
    public University() {
        this.divisions = new ArrayList<>();
    }

    // Method to add a division to the institution
    public void addDepartment(Department division) {
        divisions.add(division);
    }

    // Method to display institution details and its divisions
    public void display() {
        System.out.println("Name of the Institution: \"" + institutionName + "\"");
        for (Department division : divisions) {
            division.display();
            System.out.println(" ");
        }
    }

    // Method to delete the institution (clear all divisions)
    public void deleteUniversity() {
        System.out.println("Institution Deleted");
        divisions.clear();
    }
}

// Main class to demonstrate the functionality
public class UniversityDetails {
    public static void main(String args[]) {
        // Creating lecturer members
        Faculty arjun = new Faculty("Prof Arjun Sharma", "LE5162");
        Faculty akshay = new Faculty("Prof Akshay Kumar", "LE5268");
        Faculty anil = new Faculty("Prof Anil Kapoor", "LE5060");

        System.out.println(" ");

        // Creating divisions and adding lecturer members to them
        Department ds = new Department("Data Science", "DV19");
        Department cs = new Department("Computer Science", "DV15");
        ds.addFaculty(arjun);
        ds.addFaculty(akshay);

        System.out.println(" ");

        cs.addFaculty(anil);

        // Creating an institution and adding divisions to it
        University nit = new University();
        nit.addDepartment(ds);
        nit.addDepartment(cs);

        System.out.println(" ");

        // Displaying institution details
        nit.display();

        // Deleting the institution
        nit.deleteUniversity();
    }
}

