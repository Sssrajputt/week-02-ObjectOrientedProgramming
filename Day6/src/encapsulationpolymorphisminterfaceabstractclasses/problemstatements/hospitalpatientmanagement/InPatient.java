package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.hospitalpatientmanagement;


// Concrete class InPatient
public class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int daysAdmitted;
    private String diagnosis;

    public InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }

    @Override
    public void addRecord(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String viewRecords() {
        return "Diagnosis: " + diagnosis;
    }
}

