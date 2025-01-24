import java.util.*;

// Class representing a Car Rental system
class CarRental {
    private String customerName; // Customer's name who rented the car
    private String model;        // Model of the car rented
    private int rentalDays;      // Number of days the car is rented
    private double price;        // Price per day for renting the car
    private double total;        // Total rental cost

    // Parameterized constructor to initialize car rental details
    public CarRental(String customerName, String model, int rentalDays, double price) {
        this.customerName = customerName;
        this.model = model;
        this.rentalDays = rentalDays;
        this.price = price;
    }

    // Copy constructor to create a new CarRental object using another CarRental object
    public CarRental(CarRental obj) {
        customerName = obj.customerName;
        model = obj.model;
        rentalDays = obj.rentalDays;
        price = obj.price;
    }

    // Method to display car rental details
    public void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + model);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Price per Day: $" + price);
        double total = price * rentalDays; // Calculate total cost
        System.out.println("Total Rental Cost: $" + total);
    }
}

// Main class to test the CarRental functionality
public class CarRentalDetails {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input details for the car rental
        System.out.println("Enter Customer Name:");
        String customerName = sc.nextLine(); // Input customer name
        System.out.println("Enter Car Model:");
        String model = sc.nextLine(); // Input car model
        System.out.println("Enter Rental Days:");
        int rentalDays = sc.nextInt(); // Input number of rental days
        System.out.println("Enter Car Price per Day:");
        double price = sc.nextDouble(); // Input price per day for renting

        // Create a CarRental object using the parameterized constructor
        System.out.println("Calling Parameterized Constructor");
        CarRental CarRental1 = new CarRental(customerName, model, rentalDays, price);
        CarRental1.display(); // Display details of the first car rental
        System.out.print("\n");

        // Create a second CarRental object using the copy constructor
        System.out.println("Calling Copy Constructor");
        CarRental CarRental2 = new CarRental(CarRental1);
        CarRental2.display(); // Display details of the second (copied) car rental
    }
}
