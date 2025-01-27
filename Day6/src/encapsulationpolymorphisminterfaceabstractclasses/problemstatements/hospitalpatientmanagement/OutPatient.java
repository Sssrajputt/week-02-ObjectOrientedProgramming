package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.hospitalpatientmanagement;

// Concrete class OutPatient
public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String diagnosis;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
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
