// Class representing a Book in the library
class Book {
    private String title;       // Title of the book
    private String author;      // Author of the book
    private double price;       // Price of the book
    private boolean isAvailable; // Availability status of the book

    // Constructor to initialize Book details
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false; // Update availability status
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    // Method to return a book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true; // Update availability status
            System.out.println("You have successfully returned \"" + title + "\".");
        } else {
            System.out.println("\"" + title + "\" is already available in the library.");
        }
    }
}

// Main class to test the Library Book System
public class LibraryBookSystem{
    public static void main(String[] args) {
        // Create Book instances
        Book book1 = new Book("Effective Java", "Joshua Bloch", 45.99, true);
        Book book2 = new Book("Clean Code", "Robert C. Martin", 39.99, true);

        // Display book details
        System.out.println("Library Books:");
        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();

        System.out.println();

        // Borrow a book
        System.out.println("Borrowing Books:");
        book1.borrowBook();
        book1.borrowBook(); // Attempt to borrow an unavailable book

        System.out.println();

        // Return a book
        System.out.println("Returning Books:");
        book1.returnBook();
        book1.returnBook(); // Attempt to return a book that's already available

        System.out.println();

        // Borrow another book
        book2.borrowBook();
    }
}
