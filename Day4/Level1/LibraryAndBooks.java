import java.util.*;

//creating library class
class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " book title added");
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}


//creating book class
class Book {

    //creating variables
    private String title;
    private String author;

    //creating a constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //displaying title
    public String getTitle() {
        return title;
    }

    //displaying author name
    public String getAuthor() {
        return author;
    }
}



//creating main class
public class LibraryAndBooks {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create libraries
        Library library1 = new Library();
        Library library2 = new Library();

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);  // Same book can exist in another library
        library2.addBook(book3);

        // Show books in each library
        System.out.println("Library 1:");
        library1.showBooks();

        System.out.println("\nLibrary 2:");
        library2.showBooks();
    }
}



