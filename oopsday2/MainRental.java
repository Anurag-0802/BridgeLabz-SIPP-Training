package constructor_package;

public class MainRental {
    public static void main(String[] args) {

        // Rental using default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayRentalInfo();

        System.out.println();

        // Rental using parameterized constructor
        CarRental customRental = new CarRental("Sajal Singh", "SUV", 4);
        System.out.println("Custom Rental:");
        customRental.displayRentalInfo();
    }
}

