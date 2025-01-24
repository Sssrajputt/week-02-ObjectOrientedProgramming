// Main class representing a Book with attributes and access modifiers
class Book {
    public String ISBN;      // Public: accessible anywhere
    protected String title;  // Protected: accessible in the same package and subclasses
    private String author;   // Private: accessible only within this class

    // Method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to get the author's name
    public String getAuthor() {
        return this.author;
    }

    // Method to set the details of the book
    public void setBookDetails(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        setAuthor(author); // Use setter for the private field
    }

    // Method to display the details of the book
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}

// Subclass representing an EBook, inheriting from Book
class EBook extends Book {
   

    // Method to display details of the eBook
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);      // Accessing public member from parent
        System.out.println("Title: " + title);    // Accessing protected member from parent
      
    }
}

// Main class to test the functionality of Book and EBook classes
public class BookLibrarySystem{
    public static void main(String[] args) {
        // Create a Book instance and set its details
        Book book = new Book();
        book.setBookDetails("978-0134685991", "Effective Java", "Joshua Bloch");
        System.out.println("Book Details:");
        book.displayDetails(); // Display book details

        System.out.println();

        // Create an EBook instance and set its details
        EBook ebook = new EBook();
       
        ebook.displayEBookDetails(); // Display eBook details
    }
}
