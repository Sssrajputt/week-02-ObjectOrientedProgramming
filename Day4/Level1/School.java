import java.util.*; // Importing the utility package for using ArrayList

class Student {
    private String studentName; // Name of the student
    private final String studentRollNo; // Roll number of the student
    private ArrayList<Course> courses; // List to store courses the student is enrolled in

    // Constructor to initialize the student's details
    public Student(String studentName, String studentRollNo) {
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.courses = new ArrayList<>();
    }

    // Getter method to get the name of the student
    public String getName() {
        return studentName;
    }

    // Getter method to get the roll number of the student
    public String getRollNo() {
        return studentRollNo;
    }

    // Method to add a course to the student's list of courses
    public void addCourse(Course course) {
        courses.add(course);
       
    }

    // Method to display the student's details and courses
    public void display() {
        System.out.println("Name of the Student: \"" + studentName + "\" Roll Number of the Student: \"" + studentRollNo + "\"");
        for (Course course : courses) {
            System.out.println("Course Name: \"" + course.getName() + "\" Course Id of the Course: \"" + course.getId() + "\" Course Charges: \"" + course.getCharges() + "\"");
        }
    }
}

class Course {
    private String courseName; // Name of the course
    private final String courseId; // ID of the course
    private int courseCharge; // Charge for the course
    private ArrayList<Student> enrolledStudents; // List to store students enrolled in the course

    // Constructor to initialize the course's details
    public Course(String courseName, String courseId, int courseCharge) {
        this.courseName = courseName;
        this.courseCharge = courseCharge;
        this.courseId = courseId;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getter method to get the name of the course
    public String getName() {
        return courseName;
    }

    // Getter method to get the charges of the course
    public int getCharges() {
        return courseCharge;
    }

    // Getter method to get the ID of the course
    public String getId() {
        return courseId;
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
       
    }

    // Method to display the details of the course and enrolled students
    public void display() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("Student Name: \"" + student.getName() + "\" Student Roll Number: \"" + student.getRollNo() + "\"");
        }
    }
}

public class School{
    public static void main(String[] args) {
        // Creating student objects
        Student gagan = new Student("Gagan Tantwar", "0199AL211016");
        Student shubham = new Student("Shubham Rajput", "0199AL211056");
        Student harshit = new Student("Harshit Patel", "0199AL211018");

        // Creating course objects
        Course cpp = new Course("C++ Programming", "CT301", 5000);
        Course java = new Course("Java Programming", "CT302", 6000);
        Course python = new Course("Python Programming + DSA", "CT303", 7000);

        System.out.println(" ");

        // Adding courses to students
        gagan.addCourse(cpp);
        shubham.addCourse(java);
        harshit.addCourse(python);
        gagan.addCourse(python);
        harshit.addCourse(cpp);

        System.out.println(" ");

        // Displaying student details and courses
        gagan.display();
        System.out.println(" ");
        shubham.display();
        System.out.println(" ");
        harshit.display();
        System.out.println(" ");
        System.out.println(" ");

        // Enrolling students in courses
        cpp.enrollStudent(harshit);
        cpp.enrollStudent(gagan);
        java.enrollStudent(shubham);
        python.enrollStudent(harshit);
        python.enrollStudent(gagan);

        System.out.println(" ");

        // Displaying course details and enrolled students
        cpp.display();
        System.out.println(" ");
        java.display();
        System.out.println(" ");
        python.display();
       
    }
}


