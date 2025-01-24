class Patient {
    // Private instance variables to store the patient's name, age, and ailment status
    private String name;
    private int age;
    private boolean ailment;

    // Final instance variable to store the patient's ID (cannot be changed once assigned)
    private final String patientId;
    // Static variable to keep track of the total number of patients (shared among all instances)
    public static int totalPatients = 0;
    // Static variable to store the name of the hospital (shared among all instances)
    public static String hospitalName = "City Hospital";

    // Constructor to initialize the patient's name, age, ailment status, and patient ID
    public Patient(String name, int age, boolean ailment, String patientId) {
        this.name = name;  // Refers to the instance variable
        this.age = age;  // Refers to the instance variable
        this.ailment = ailment;  // Refers to the instance variable
        this.patientId = patientId;
        // Increment the total number of patients by 1 whenever a new patient is created
        totalPatients++;
    }

    // Static method to get the total number of patients
    public static void getTotalPatients() {
        System.out.println("Total number of patients: " + totalPatients);
    }

    // Method to display patient details
    public void display() {
        System.out.println("Hospital name: " + hospitalName);
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + age);
        System.out.println("Patient Ailment: " + ailment);
        System.out.println("Patient ID: " + patientId + "\n");
    }
}

// Main class to test the Patient class
public class PatientDetails {
    public static void main(String[] args) {
        // Creating two instances of Patient with different names, ages, ailment statuses, and patient IDs
        Patient patient1 = new Patient("Shubham", 21, false, "63847237840934");
        Patient patient2 = new Patient("Shldm", 23, true, "63454357840934");

        // Checking if patient1 is an instance of Patient and displaying its details
        if (patient1 instanceof Patient) {
            System.out.println("patient1 is an instance of Patient");
            patient1.display();
        }

        // Checking if patient2 is an instance of Patient and displaying its details
        if (patient2 instanceof Patient) {
            System.out.println("patient2 is an instance of Patient");
            patient2.display();
        }

        // Calling the static method to get the total number of patients
        Patient.getTotalPatients();
    }
}
