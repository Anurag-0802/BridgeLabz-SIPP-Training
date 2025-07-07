import java.util.Scanner;
public class VehicleAndTransportSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cSpeed, seatCap, tSpeed, loadCap, bSpeed;
		String cFuel, tFuel, bFuel;
		boolean luggageRack;
		
		Vehicle[] vehicles = new Vehicle[3];
		
		// Car user input
        System.out.println("Enter details for Car : ");
        System.out.print("Max Speed : ");
        cSpeed = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Fuel Type : ");
        cFuel = sc.nextLine();
        System.out.print("Seat Capacity : ");
        seatCap = sc.nextInt();
        sc.nextLine();
        vehicles[0] = new Car(cSpeed, cFuel, seatCap);
        
        // Truck user input
        System.out.println("\nEnter details for Truck : ");
        System.out.print("Max Speed : ");
        tSpeed = sc.nextInt();
        sc.nextLine();
        System.out.print("Fuel Type : ");
        tFuel = sc.nextLine();
        System.out.print("Load Capacity (kg) : ");
        loadCap = sc.nextInt();
        sc.nextLine();
        vehicles[1] = new Truck(tSpeed, tFuel, loadCap);
        
        // Motorcycle input
        System.out.println("\nEnter details for Motorcycle : ");
        System.out.print("Max Speed : ");
        bSpeed = sc.nextInt();
        sc.nextLine();
        System.out.print("Fuel Type : ");
        bFuel = sc.nextLine();
        System.out.print("Has Carrier? (true/false) : ");
        luggageRack = sc.nextBoolean();
        vehicles[2] = new Motorcycle(bSpeed, bFuel, luggageRack);
        
     // Display all vehicle info
        System.out.println("\n---- Vehicle Details ----");
        for (Vehicle v : vehicles) {
            System.out.println("---------------");
            v.displayInfo();
        }
	}

}
