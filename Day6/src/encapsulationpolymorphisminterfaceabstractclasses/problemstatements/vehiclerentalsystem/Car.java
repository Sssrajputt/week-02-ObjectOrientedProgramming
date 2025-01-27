package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.vehiclerentalsystem;


// Concrete class Car
public class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceAmount;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public void calculateInsurance() {
        // Example calculation for insurance amount
        insuranceAmount = getRentalRate() * 0.1;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber + ", Insurance Amount: " + insuranceAmount;
    }
}
