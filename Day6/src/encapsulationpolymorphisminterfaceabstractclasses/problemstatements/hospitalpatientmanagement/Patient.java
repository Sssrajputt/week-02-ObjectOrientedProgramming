package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.hospitalpatientmanagement;


// Abstract class Patient
public abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    // Constructor to initialize patient details
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods for patientId
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method to calculate bill
    public abstract double calculateBill();

    // Method to get patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

