package constructor_package;

public class CarRental {

    // Attributes
    String customerName;
    String carModel;
    int rentalDays;

    // Default constructor
    public CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to get daily rate based on car model
    public double getDailyRate() {
        switch (carModel.toLowerCase()) {
            case "sedan":
                return 1500.0;
            case "suv":
                return 2500.0;
            case "hatchback":
                return 1000.0;
            default:
                return 1200.0; // default rate
        }
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return getDailyRate() * rentalDays;
    }

    // Method to display rental details
    public void displayRentalInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model    : " + carModel);
        System.out.println("Rental Days  : " + rentalDays);
        System.out.println("Total Cost   : ₹" + calculateTotalCost());
    }
}

