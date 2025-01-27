package encapsulationpolymorphisminterfaceabstractclasses.problemstatements.librarymanagementsystem;


// Main class to test the library management system
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // List to store library items
        List<LibraryItem> items = new ArrayList<>();

        // Add Book
        Book book = new Book("B123", "The Great Gatsby", "F. Scott Fitzgerald", 14);
        book.reserveItem("John Doe");
        items.add(book);

        // Add Magazine
        Magazine magazine = new Magazine("M123", "National Geographic", "Various", 7);
        items.add(magazine);

        // Add DVD
        DVD dvd = new DVD("D123", "Inception", "Christopher Nolan", 3);
        dvd.reserveItem("Jane Doe");
        items.add(dvd);

        // Display details and loan duration for each item
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Availability: " + (reservable.checkAvailability() ? "Available" : "Reserved"));
                if (!reservable.checkAvailability()) {
                    System.out.println("Borrower: " + ((item instanceof Book) ? ((Book) item).getBorrower()
                            : (item instanceof Magazine) ? ((Magazine) item).getBorrower()
                            : ((DVD) item).getBorrower()));
                }
            }
            System.out.println("---------------------");
            System.out.println();
        }
    }
}
