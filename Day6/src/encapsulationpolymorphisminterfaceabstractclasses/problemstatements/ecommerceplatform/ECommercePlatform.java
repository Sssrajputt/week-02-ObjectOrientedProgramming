package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.ecommerceplatform;

// Main class to test the e-commerce platform
import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {
    public static void main(String[] args) {
        // List to store products
        List<Product> products = new ArrayList<>();

        // Add Electronics product
        Electronics electronics = new Electronics(1, "Laptop", 50000, 0.18, 0.10);
        electronics.calculateTax();
        products.add(electronics);

        // Add Clothing product
        Clothing clothing = new Clothing(2, "Shirt", 1000, 0.05, 0.20);
        clothing.calculateTax();
        products.add(clothing);

        // Add Groceries product
        Groceries groceries = new Groceries(3, "Apple", 200, 0.12, 0.15);
        groceries.calculateTax();
        products.add(groceries);

        // Display final price for each product
        for (Product product : products) {
            System.out.println("Product: " + product.getName());
            System.out.println("Final Price: " + (product instanceof Electronics
                    ? ((Electronics) product).finalPrice()
                    : product instanceof Clothing
                    ? ((Clothing) product).finalPrice()
                    : ((Groceries) product).finalPrice()));
            System.out.println("---------------------");
            System.out.println();
        }
    }
}


