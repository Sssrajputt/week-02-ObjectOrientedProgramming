package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.onlinefooddeliverysystem;


// Main class to test the online food delivery system
import java.util.ArrayList;
import java.util.List;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // List to store food items
        List<FoodItem> foodItems = new ArrayList<>();

        // Add VegItem
        VegItem vegItem = new VegItem("Paneer Tikka", 150, 2);
        vegItem.applyDiscount(0.10); // 10% discount
        foodItems.add(vegItem);

        // Add NonVegItem
        NonVegItem nonVegItem = new NonVegItem("Chicken Biryani", 200, 1, 50);
        nonVegItem.applyDiscount(0.15); // 15% discount
        foodItems.add(nonVegItem);

        // Display total price and discount details for each food item
        for (FoodItem item : foodItems) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                System.out.println("Discount Amount: " + discountable.getDiscountDetails());
            }
            System.out.println("---------------------");
            System.out.println();
        }
    }
}


