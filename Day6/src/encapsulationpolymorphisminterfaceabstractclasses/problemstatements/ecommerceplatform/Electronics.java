package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.ecommerceplatform;

// Concrete class Electronics
public class Electronics extends Product implements Taxable {
    private double taxRate;
    private double discountRate;
    private double taxAmount;
    private double discountAmount;

    public Electronics(int productId, String name, double price, double taxRate, double discountRate) {
        super(productId, name, price);
        this.taxRate = taxRate;
        this.discountRate = discountRate;
    }

    @Override
    public void calculateTax() {
        taxAmount = getPrice() * taxRate;
    }

    @Override
    public double getTaxDetails() {
        return taxAmount;
    }

    @Override
    public double calculateDiscount() {
        discountAmount = getPrice() * discountRate;
        return discountAmount;
    }

    public double finalPrice() {
        return getPrice() - calculateDiscount() + getTaxDetails();
    }
}