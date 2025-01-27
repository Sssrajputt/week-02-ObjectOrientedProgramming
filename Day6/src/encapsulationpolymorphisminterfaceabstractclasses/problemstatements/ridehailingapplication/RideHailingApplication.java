package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.ridehailingapplication;


// Main class to test the ride-hailing application
import java.util.ArrayList;
import java.util.List;

public class RideHailingApplication {
    public static void main(String[] args) {
        // List to store vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add Car
        Car car = new Car("CAR123", "John Doe", 10, "Downtown");
        vehicles.add(car);

        // Add Bike
        Bike bike = new Bike("BIKE123", "Jane Doe", 5, "Suburbs");
        vehicles.add(bike);

        // Add Auto
        Auto auto = new Auto("AUTO123", "Jim Doe", 7, "Uptown");
        vehicles.add(auto);

        // Calculate and display fare for each vehicle
        double distance = 15; // Example distance
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("New Location");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }
            System.out.println("---------------------");
            System.out.println();
        }
    }
}

