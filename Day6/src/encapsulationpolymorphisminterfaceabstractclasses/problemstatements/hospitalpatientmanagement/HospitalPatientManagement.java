package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.hospitalpatientmanagement;

// Main class to test the hospital patient management system
import java.util.ArrayList;
import java.util.List;

public class HospitalPatientManagement {
    public static void main(String[] args) {
        // List to store patients
        List<Patient> patients = new ArrayList<>();

        // Add InPatient
        InPatient inPatient = new InPatient("IP123", "John Doe", 30, 5000, 3);
        inPatient.addRecord("Pneumonia");
        patients.add(inPatient);

        // Add OutPatient
        OutPatient outPatient = new OutPatient("OP123", "Jane Doe", 25, 1500);
        outPatient.addRecord("Fever");
        patients.add(outPatient);

        // Display details and bill for each patient
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill: " + patient.calculateBill());
            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                System.out.println(record.viewRecords());
            }
            System.out.println("---------------------");
            System.out.println();
        }
    }
}


