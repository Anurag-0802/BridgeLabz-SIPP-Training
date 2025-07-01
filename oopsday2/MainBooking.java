package constructor_package;

public class MainBooking {
    public static void main(String[] args) {

        // Booking using default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBookingInfo();
        System.out.println();

        // Booking using parameterized constructor
        HotelBooking customBooking = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("Custom Booking:");
        customBooking.displayBookingInfo();
        System.out.println();

        // Booking using copy constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("Copied Booking:");
        copiedBooking.displayBookingInfo();
    }
}