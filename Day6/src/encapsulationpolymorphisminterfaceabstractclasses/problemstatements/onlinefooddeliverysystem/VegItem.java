package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.onlinefooddeliverysystem;


// Concrete class VegItem
public class VegItem extends FoodItem implements Discountable {
    private double discountAmount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - discountAmount;
    }

    @Override
    public void applyDiscount(double discountRate) {
        discountAmount = getPrice() * discountRate;
    }

    @Override
    public double getDiscountDetails() {
        return discountAmount;
    }
}

