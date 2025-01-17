import java.util.*;

// Creating Book class
class Book {

    // Creating attributes of class
    String title;
    String author;
    int price;

    // Creating a constructor to initialize attributes
    public Book(String title, String author, int price) {
        // Using this keyword to initialize attributes
        this.title = title;
        this.author = author;
        this.price = price; 
    }

    // Method for displaying details
    void display() {
        // Displaying the details
        System.out.println("The book title: " + title);
        System.out.println("The book author: " + author);
        System.out.println("The book price: " + price);
    }
}

// Creating Main class
public class BookDetails {
    public static void main(String args[]) {
        // Creating Book class object
        Book book = new Book("Chiranjeevi", "Shubham", 200);
        
        // Displaying book details
        book.display();
    }
}
