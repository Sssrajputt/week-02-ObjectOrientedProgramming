// Class representing a Course
class Course {
    private String courseName;  // Name of the course
    private String duration;    // Duration of the course
    private int fees;           // Fees for the course
    private static String instituteName; // Static variable to hold the institute name (shared across all Course objects)

    // Parameterized constructor to initialize course details
    public Course(String courseName, String duration, int fees) {
        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
    }

    // Static method to change the institute name
    public static void changeInstitute(String instituteName) {
        Course.instituteName = instituteName; // Set the institute name
        System.out.println("Name of Institute: " + instituteName);
    }

    // Method to display course details
    public void display() {
        System.out.println("Name of the Course: " + courseName);
        System.out.println("Duration of the Course: " + duration);
        System.out.println("Fees of the Course: " + fees);
    }
}

// Main class to test the Course functionality
public class CourseDetails {
    public static void main(String args[]) {
        // Change the institute name using the static method
        Course.changeInstitute("TIT Groups");
        System.out.println();

        // Create Course objects with different details
        Course course1 = new Course("B-TECH", "4 Years", 400000);
        Course course2 = new Course("B-COM", "3 Years", 200000);
        Course course3 = new Course("B-PHARMA", "4 Years", 300000);

        // Display details of each course
        course1.display();
        System.out.println();
        course2.display();
        System.out.println();
        course3.display();
        System.out.println();

        // Change the institute name again using the static method
        Course.changeInstitute("LNCT Groups");
        System.out.println();

        // Create more Course objects with updated details
        Course course4 = new Course("B-TECH", "4 Years", 500000);
        Course course5 = new Course("B-COM", "3 Years", 300000);
        Course course6 = new Course("B-PHARMA", "4 Years", 400000);

        // Display details of the new courses
        course4.display();
        System.out.println();
        course5.display();
        System.out.println();
        course6.display();
    }
}
