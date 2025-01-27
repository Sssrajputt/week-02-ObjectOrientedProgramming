package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.vehiclerentalsystem;


// Main class to test the vehicle rental system
import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        // List to store vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add Car
        Car car = new Car("CAR123", 500, "CARINS123");
        car.calculateInsurance();
        vehicles.add(car);

        // Add Bike
        Bike bike = new Bike("BIKE123", 200, "BIKEINS123");
        bike.calculateInsurance();
        vehicles.add(bike);

        // Add Truck
        Truck truck = new Truck("TRUCK123", 800, "TRUCKINS123");
        truck.calculateInsurance();
        vehicles.add(truck);

        // Calculate and display rental and insurance costs for each vehicle
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle: " + vehicle.getType() + ", Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println(insurable.getInsuranceDetails());
            }
            System.out.println("---------------------");
            System.out.println();
        }
    }
}
