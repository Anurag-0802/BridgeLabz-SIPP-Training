import java.util.*;

public class RideHandlingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        ArrayList<RideVehicle> rides = new ArrayList<>();

        System.out.print("Enter number of rides : ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nRide " + (i + 1));
            System.out.print("Enter vehicle type (1-Car, 2-Bike, 3-Auto) : ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Vehicle ID : ");
            String vehicleId = sc.nextLine();

            System.out.print("Enter Driver Name : ");
            String driverName = sc.nextLine();

            System.out.print("Enter Rate per Km : ");
            double rate = sc.nextDouble();

            RideVehicle ride = null;
            if (type == 1) {
                ride = new Cars(vehicleId, driverName, rate);
            } else if (type == 2) {
                ride = new Bikes(vehicleId, driverName, rate);
            } else if (type == 3) {
                ride = new Auto(vehicleId, driverName, rate);
            } else {
                System.out.println("Invalid type! Skipping...");
                continue;
            }

            rides.add(ride);
        }
        
        System.out.print("\nEnter distance of each ride (in km) : ");
        double distance = sc.nextDouble();

        System.out.println("\n--- Fare Summary ---");
        for (RideVehicle v : rides) {
            v.getVehicleDetails();
            double fare = v.calculateFare(distance);
            System.out.println("Fare for " + distance + " km : Rs." + fare);

            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                System.out.println("Current Location : " + gps.getCurrentLocation());
                gps.updateLocation("Customer Pickup Point");
                System.out.println("Updated Location : " + gps.getCurrentLocation());
            }

            System.out.println("-----------------------------");
        }	
     }

}
