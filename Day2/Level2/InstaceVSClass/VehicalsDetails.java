// Class representing Vehicles
class Vehicals {
    private String ownerName;       // Name of the vehicle owner
    private String vehicalType;     // Type of the vehicle (e.g., SUV, Sedan)
    private int registrationFees = 5000; // Fixed registration fee for all vehicles

    // Parameterized constructor to initialize vehicle details
    public Vehicals(String ownerName, String vehicalType) {
        this.ownerName = ownerName;       // Assign owner's name
        this.vehicalType = vehicalType;   // Assign vehicle type
    }

    // Method to display vehicle details
    public void display() {
        System.out.println("Name of the Owner: " + ownerName);            // Display owner's name
        System.out.println("Vehicle Type of the Vehicle: " + vehicalType); // Display vehicle type
        System.out.println("Registration Fees of the Vehicle: " + registrationFees); // Display registration fees
    }
}

// Main class to demonstrate the functionality of the Vehicles class
public class VehicalsDetails {
    public static void main(String args[]) {
        // Create Vehicle objects with different owner names and vehicle types
        Vehicals Vehicals1 = new Vehicals("Raj", "SUV");
        Vehicals Vehicals2 = new Vehicals("Bhupendra", "Sedan");
        Vehicals Vehicals3 = new Vehicals("Tanmay", "SUV");

        // Display details of each vehicle
        Vehicals1.display();
        System.out.println(); // Print an empty line for readability
        Vehicals2.display();
        System.out.println();
        Vehicals3.display();
    }
}
