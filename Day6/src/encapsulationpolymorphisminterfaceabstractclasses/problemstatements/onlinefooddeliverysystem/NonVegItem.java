package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.onlinefooddeliverysystem;


// Concrete class NonVegItem
public class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discountAmount;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + additionalCharge) * getQuantity() - discountAmount;
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
