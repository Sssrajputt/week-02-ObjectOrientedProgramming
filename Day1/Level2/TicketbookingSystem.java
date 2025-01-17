import java.util.*;

class MovieTicket {
    String movieName;
    int seatNumber;
    int price;

    // MovieTicket class constructor 
    MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    int bookATicket(int seatNumber, int price) {
        this.seatNumber = seatNumber;
        this.price = price; // Set the price instead of adding
        return seatNumber; // Return seatNumber instead of seatnumber
    }

    void ticketDetails() {
        System.out.println("Ticket name: " + movieName);
        System.out.println("Ticket price: " + price);
        System.out.println("Ticket seat number: " + seatNumber); // Corrected method call
    }
}

public class TicketbookingSystem {
    public static void main(String[] args) { // Changed args to String[] args
        MovieTicket ticket = new MovieTicket("Saaho");
        ticket.bookATicket(12, 250); // Added bookATicket call with seat number and price
        ticket.ticketDetails();
    }
}
