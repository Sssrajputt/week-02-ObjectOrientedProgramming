class Product {
    // Private member variables to store product name and price
    private String productName;
    private double price;
    // Static variable to keep track of total number of products created
    private static int totalProducts = 0;

    // Constructor to initialize product name and price, and increment totalProducts
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts += 1;
    }

    // Method to display the details of the product
    public void displayDetails() {
        System.out.println("Name of Product: " + productName);
        System.out.println("Price of the Product: " + price);
    }

    // Static method to display the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Number Of Products: " + totalProducts);
    }
}

public class ProductDetails {
    public static void main(String[] args) {
        // Creating instances of Product class
        Product item1 = new Product("Apple", 100);
        Product item2 = new Product("Rice", 40.5);
        Product item3 = new Product("Wheat", 45.5);
        Product item4 = new Product("Banana", 30);

        // Displaying details of each product
        item1.displayDetails();
        item2.displayDetails();
        item3.displayDetails();
        item4.displayDetails();

        // Displaying the total number of products created
        Product.displayTotalProducts();
    }
}