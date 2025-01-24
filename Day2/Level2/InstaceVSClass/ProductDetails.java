class Product{
    private String productName;
    private double  price;
    private static int totalProducts=0;
    public Product(String productName,double price){
        this.productName=productName;
        this.price=price;
        totalProducts+=1;
    }
    public void displayDetails(){
        System.out.println("Name of Product: "+productName);
        System.out.println("Price of the Product: "+price);

    }
    public static void displayTotalProducts(){
        System.out.println("Total Number Of Products: "+totalProducts);
    }
    
}
public class ProductDetails{
    public static void main(String[] args) {
        Product item1=new Product("Apple",100);
        Product item2=new Product("Rice",40.5);
        Product item3=new Product("Wheat",45.5);
        Product item4=new Product("Banana",30);
        item1.displayDetails();
        item2.displayDetails();
        item3.displayDetails();
        item4.displayDetails();
        Product.displayTotalProducts();
    }
    


}