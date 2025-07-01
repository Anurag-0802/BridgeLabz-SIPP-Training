package constructor_package;

public class VehicleDetailDisplayer {
	
    // Instance method to display vehicle details
    public void displayVehicleDetails(Vehicle vehicle) {
        System.out.println("Owner Name       : " + vehicle.ownerName);
        System.out.println("Vehicle Type     : " + vehicle.vehicleType);
        System.out.println("Registration Fee : " + Vehicle.registrationFee);
    }
}

