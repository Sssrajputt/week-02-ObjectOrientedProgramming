import java.util.*;

// Creating mobilephone class
class MobilePhone {

    // Creating attributes of class
    String brand;
    String model;
    int price;

    // Creating a constructor to initialize attributes
    public Item(String brand , String model ; int price) {
        // Using this keyword to initialize attributes
        this.brand = brand;
        this.model = model;
        this.price = price; 
    }

    // Method for displaying details
    void display() {
        // Displaying the details
        System.out.println("Mobile phone brand: " + brand);
        System.out.println("Mobile phone model: " + model);
        System.out.println("Mobile phone price: " + price);
       }
}

// Creating Main class
public class MobilePhoneDetails {
    public static void main(String args[]) {
        // Creating mobilephone class object
        MobilePhone mobilephone = new MobilePhone("samsung", "A1", 434340);
        
        // Displaying mobilephone details
        mobilephone.display();
    }
}
