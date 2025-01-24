import java.util.*;

// Class representing a student with attributes and methods to manipulate student details
class Student {
    public String rollNumber; // Public attribute to store roll number
    private double cgpa;      // Private attribute to store CGPA
    protected String name;    // Protected attribute to store the student's name

    // Method to initialize student details
    public void getStudent(String rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Method to change the CGPA of the student
    public void changeCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name of the Student: " + name);
        System.out.println("Roll Number of the Student: " + rollNumber);
        System.out.println("CGPA Of the Student: " + cgpa);
    }
}

// Subclass extending Student, allowing name modification
class NameChange extends Student {
    // Method to change the name of the student and return the updated name
    public String changeName(String name) {
        this.name = name;
        return name;
    }
}

// Main class to demonstrate the functionality of Student and NameChange classes
public class StudentDetails {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Creating a student object 'ram' and initializing it
        Student ram = new Student();
        ram.getStudent("0199AL211053", "Ram Sharma", 8.797);
        ram.display(); // Displaying initial details of 'ram'

        // Changing the CGPA of 'ram'
        System.out.println("Enter the New CGPA");
        double cgpa = sc.nextDouble();
        sc.nextLine(); // Clear the input buffer
        ram.changeCGPA(cgpa);
        ram.display(); // Displaying updated details of 'ram'

        // Creating another student 'kishan' and initializing it
        System.out.println("New Student");
        Student kishan = new Student();
        kishan.getStudent("0199AL211023", "Kishan Soni", 8.89);
        kishan.display(); // Displaying details of 'kishan'

        // Changing the name of 'kishan' using NameChange class
        System.out.println(" ");
        System.out.println("Enter Name you want to change ");
        String input = sc.nextLine(); // Taking new name input
        NameChange newName = new NameChange(); // Creating an object of NameChange
        String name = newName.changeName(input); // Changing the name using NameChange class
        kishan.getStudent("0199AL211023", name, 8.89); // Updating 'kishan' details with the new name
        kishan.display(); // Displaying updated details of 'kishan'

        sc.close(); // Closing the scanner
    }
}
