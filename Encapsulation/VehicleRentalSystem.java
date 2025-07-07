import java.util.*;
public class VehicleRentalSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Enter number of vehicles : ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Vehicle " + (i + 1));
            System.out.print("Enter vehicle type (1-Car, 2-Bike, 3-Truck) : ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Vehicle Number : ");
            String number = sc.nextLine();

            System.out.print("Enter Rental Rate per Day : ");
            double rate = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Insurance Policy Number : ");
            String policy = sc.nextLine();

            Vehicle v = null;
            if (type == 1) {
                v = new Car(number, rate, policy);
            } else if (type == 2) {
                v = new Bike(number, rate, policy);
            } else if (type == 3) {
                v = new Truck(number, rate, policy);
            } else {
                System.out.println("Invalid vehicle type. Skipping...");
                continue;
            }

            vehicles.add(v);
        }
        
        System.out.print("\nEnter number of rental days for all vehicles : ");
        int days = sc.nextInt();

        System.out.println("\n---- Vehicle Rental Summary ----");
        for (Vehicle v : vehicles) {
            System.out.println("\nVehicle Number : " + v.getVehicleNumber());
            System.out.println("Type : " + v.getType());
            System.out.println("Rental Rate : " + v.getRentalRate());

            double rentalCost = v.calculateRentalCost(days);
            System.out.println("Rental Cost for " + days + " days : " + rentalCost);

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance Cost : " + ins.calculateInsurance());
                System.out.println(ins.getInsuranceDetails());
            }

            System.out.println("------------------------------");
        }
	}
}
