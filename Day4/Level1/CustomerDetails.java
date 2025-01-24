import java.util.*; // Importing the utility package for using ArrayList

class Customer {
    private String customerName; // Name of the customer
    private String customerAddress; // Address of the customer
    private int customerAge; // Age of the customer
    private double balance; // Balance of the customer
   

    // Constructor to initialize the customer's details
    public Customer(String customerName, String customerAddress, int customerAge, double balance) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerAge = customerAge;
        this.balance = balance;
   
    }

    // Getter method to get the name of the customer
    public String getName() {
        return customerName;
    }

    // Getter method to get the address of the customer
    public String getAddress() {
        return customerAddress;
    }

    // Getter method to get the age of the customer
    public int getAge() {
        return customerAge;
    }

    // Getter method to get the balance of the customer
    public double getBalance() {
        return balance;
    }
   
   
}

class Bank {
    public String bankName; // Name of the bank
    private ArrayList<Customer> customerDetails; // List to store customer details

    // Constructor to initialize the bank's name and customer details list
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customerDetails = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer) {
        customerDetails.add(customer);
        System.out.println("Customer added to Bank: ");
    }

    // Method to display the bank details and customers
    public void display() {
        System.out.println("Name of the Bank is: " + bankName);
        for (Customer customer : customerDetails) {
            System.out.println("Name of the Customer: \"" + customer.getName() + "\" Address of the customer: \"" + customer.getAddress() + "\" Age of the customer: \"" + customer.getAge() + "\"");
            System.out.println("Balance of the Customer: \"" + customer.getBalance() + "\"");

        }
    }
}

public class CustomerDetails {
    public static void main(String args[]) {
        // Creating customer objects
        Customer gagan = new Customer("Gagan Tantwar", "Karond", 21, 5000);
        Customer shubham = new Customer("Shubham Rajput", "Aligarh", 24, 10001.24);
        Customer harshit = new Customer("Harshit Patel", "Itarsi", 23, 5502.36);

        // Creating bank object for SBI
        Bank sbi = new Bank("State Bank Of India");
        sbi.openAccount(gagan);
        sbi.openAccount(shubham);
        sbi.openAccount(harshit);
        System.out.println("");
        sbi.display();

        // Creating bank object for BOI
        Bank boi = new Bank("Bank Of India");
        boi.openAccount(gagan);
        System.out.println("");
        boi.display();
    }
}

