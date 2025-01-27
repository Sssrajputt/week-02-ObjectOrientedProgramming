package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.vehiclerentalsystem;


// Concrete class Bike
public class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceAmount;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public void calculateInsurance() {
        // Example calculation for insurance amount
        insuranceAmount = getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber + ", Insurance Amount: " + insuranceAmount;
    }
}

