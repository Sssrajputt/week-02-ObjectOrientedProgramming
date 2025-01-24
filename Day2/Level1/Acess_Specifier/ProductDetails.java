class Product {
    // Private instance variables to store the product's name, price, and quantity
    private String productName;
    private double price;
    private double quantity;
    // Final instance variable to store the product's ID (cannot be changed once assigned)
    private final int productId;
    // Static variable to store the discount (shared among all instances)
    private static double discount = 10;

    // Constructor to initialize the product's name, ID, price, and quantity
    public Product(String productName, int productId, double price, double quantity) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount and print the updated discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated Discount: " + newDiscount);
    }

    // Method to display the product details
    public void display() {
        System.out.println("Name of the Product: " + productName);
        System.out.println("Product ID of the Product: " + productId);
        System.out.println("Price of the Product: " + price);
        System.out.println("Quantity of the Product: " + quantity);
    }
}

public class ProductDetails {
    public static void main(String args[]) {
        // Creating two instances of Product with different names, IDs, prices, and quantities
        Product item1 = new Product("Biscuit", 501, 5, 10);
        Product item2 = new Product("Chips", 502, 10, 20);

        // Checking if item1 is an instance of Product and displaying its details
        if (item1 instanceof Product) {
            System.out.println("item1 is an instance of Product");
            item1.display();
        }
        System.out.print("\n");

        // Checking if item2 is an instance of Product and displaying its details
        if (item2 instanceof Product) {
            System.out.println("item2 is an instance of Product");
            item2.display();
        }
        System.out.print("\n");

        // Calling the static method to update the discount
        Product.updateDiscount(15);
    }
}
