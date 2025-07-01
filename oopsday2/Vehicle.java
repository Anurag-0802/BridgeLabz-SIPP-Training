package constructor_package;

public class Vehicle {
	
    // Instance variable
    String ownerName;
    String vehicleType;

    // Class variable
    static double registrationFee = 1000.0; 

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
}

