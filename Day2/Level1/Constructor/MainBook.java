class Book {
    // Private member variables to store book's title, author, and price
    private String title;
    private String authore;
    private int price;

    // Default constructor to initialize default values
    public Book() {
        title = "Two States";
        authore = "Chetan Bhagat";
        price = 501;
    }

    // Parameterized constructor to initialize book's title, author, and price
    public Book(String title, String authore, int price) {
        this.title = title;
        this.authore = authore;
        this.price = price;
    }

    // Method to display the details of the book
    public void display() {
        System.out.println("Title Of Book: " + title);
        System.out.println("Authore Of Book: " + authore);
        System.out.println("Price Of Book: " + price);
    }
}

public class MainBook {
    public static void main(String args[]) {
        // Creating a Book object using the default constructor
        System.out.println("Calling Default Constructor");
        Book bookDefault = new Book();
        bookDefault.display();
        System.out.print("\n");

        // Creating a Book object using the parameterized constructor
        System.out.println("Calling Parameterized Constructor");
        Book bookParameterized = new Book("How To Win Friend", "Dale Charnige", 550);
        bookParameterized.display();
    }
}
