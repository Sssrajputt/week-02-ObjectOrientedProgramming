import java.util.*;

// Class representing a Product
class Product {
    private String itemName;
    private final String itemId;
    private int itemPrice;

    // Constructor to initialize Product object
    public Product(String itemName, String itemId, int itemPrice) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemPrice = itemPrice;
    }

    // Getter method for product name
    public String getName() {
        return itemName;
    }

    // Getter method for product ID
    public String getId() {
        return itemId;
    }

    // Getter method for product price
    public int getPrice() {
        return itemPrice;
    }
}

// Class representing an Order
class Order {
    private String shippingAddress;
    private final String purchaseId;
    private ArrayList<Product> items;

    // Constructor to initialize Order object
    public Order(String shippingAddress, String purchaseId) {
        this.shippingAddress = shippingAddress;
        this.purchaseId = purchaseId;
        this.items = new ArrayList<>();
    }

    // Getter method for delivery address
    public String getAddress() {
        return shippingAddress;
    }

    // Getter method for order ID
    public String getId() {
        return purchaseId;
    }

    // Method to add a product to the order
    public void addProduct(Product item) {
        items.add(item);
    }

    // Method to display order details and its products
    public void display() {
        System.out.println("Address of the Order: \"" + shippingAddress + "\" Order Id: \"" + purchaseId + "\"");
        for (Product item : items) {
            System.out.println("Product Name: \"" + item.getName() + "\" Product Id: \"" + item.getId() + "\" Price of the Product: \"" + item.getPrice() + "\"");
        }
    }
}

// Class representing a Customer
class Customer {
    public String buyerName;
    private ArrayList<Order> purchases;

    // Constructor to initialize Customer object
    public Customer(String buyerName) {
        this.buyerName = buyerName;
        this.purchases = new ArrayList<>();
    }

    // Method to add an order to the customer
    public void addOrder(Order purchase) {
        purchases.add(purchase);
    }

    // Method to display customer details and their orders
    public void display() {
        System.out.println("Name of the Customer: \"" + buyerName + "\"");
        for (Order purchase : purchases) {
            purchase.display();
            System.out.println(" ");
        }
    }
}

// Main class to demonstrate the functionality
public class OrderDetails {
    public static void main(String args[]) {
        // Creating products
        Product item1 = new Product("Trimmer", "PID908", 500);
        Product item2 = new Product("Facial Cream", "PID526", 200);
        Product item3 = new Product("Hair Wax", "PID506", 100);

        System.out.println(" ");

        // Creating orders and adding products to them
        Order purchase1 = new Order("Krishak Nagar", "OID19");
        Order purchase2 = new Order("Anand Nagar", "OID15");
        purchase1.addProduct(item1);
        purchase1.addProduct(item2);
        System.out.println(" ");
        purchase2.addProduct(item3);

        // Creating customers and adding orders to them
        Customer buyer1 = new Customer("Gagan Tantwar");
        Customer buyer2 = new Customer("Raj Srivastav");

        buyer1.addOrder(purchase1);
        buyer2.addOrder(purchase2);

        // Displaying customer details
        buyer1.display();
        buyer2.display();
    }
}

