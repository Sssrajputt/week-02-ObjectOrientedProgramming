class HotelBooking {
    // Private member variables to store guest's name, room type, and number of nights
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor to initialize default values
    public HotelBooking() {
        guestName = "Raman Singh";
        roomType = "AC";
        nights = 2;
    }

    // Parameterized constructor to initialize guest's name, room type, and number of nights
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor to create a new HotelBooking object with the same values as another HotelBooking object
    public HotelBooking(HotelBooking hDefault) {
        guestName = hDefault.guestName;
        roomType = hDefault.roomType;
        nights = hDefault.nights;
    }

    // Method to display the details of the hotel booking
    public void display() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Nights Of Guest: " + nights);
    }
}

public class HotelDetails {
    public static void main(String args[]) {
        // Creating a HotelBooking object using the default constructor
        System.out.println("Calling Default Constructor");
        HotelBooking hotelDefault = new HotelBooking();
        hotelDefault.display();
        System.out.print("\n");

        // Creating a HotelBooking object using the parameterized constructor
        System.out.println("Calling Parameterized Constructor");
        HotelBooking hotelParameterized = new HotelBooking("Karan Kumar", "Non AC", 5);
        hotelParameterized.display();
        System.out.print("\n");

        // Creating a HotelBooking object using the copy constructor
        System.out.println("Calling Copy Constructor");
        HotelBooking hotelcopy = new HotelBooking(hotelDefault);
        hotelcopy.display();
    }
}
