package constructor_package;

public class MainVehicle {
    public static void main(String[] args) {
    	
        // Create Vehicle objects
        Vehicle v1 = new Vehicle("Ravi Kumar", "Car");
        Vehicle v2 = new Vehicle("Sajal Singh", "Scooter");

        // Create utility class objects
        VehicleDetailDisplayer displayer = new VehicleDetailDisplayer();
        RegistrationFeeUpdater feeUpdater = new RegistrationFeeUpdater();

        System.out.println("Vehicle 1 Details:");
        displayer.displayVehicleDetails(v1);
        System.out.println();

        System.out.println("Vehicle 2 Details:");
        displayer.displayVehicleDetails(v2);
        System.out.println();

        feeUpdater.updateRegistrationFee(1500.0);
        System.out.println();

        System.out.println("Updated Vehicle 1 Details:");
        displayer.displayVehicleDetails(v1);
        System.out.println();

        System.out.println("Updated Vehicle 2 Details:");
        displayer.displayVehicleDetails(v2);
    }
}

