package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.vehiclerentalsystem;

// Concrete class Truck
public class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceAmount;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public void calculateInsurance() {
        // Example calculation for insurance amount
        insuranceAmount = getRentalRate() * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber + ", Insurance Amount: " + insuranceAmount;
    }
}
