import java.util.Scanner;
public class VehicleManagementSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Electric Vehicle Input
        System.out.print("Enter Electric Vehicle Model : ");
        String evModel = sc.nextLine();
        System.out.print("Enter Max Speed (EV) : ");
        int evSpeed = sc.nextInt();
        System.out.print("Enter Battery Capacity (kWh) : ");
        int battery = sc.nextInt();
        sc.nextLine(); 

        ElectricVehicle ev = new ElectricVehicle(evModel, evSpeed, battery);
        ev.displayDetails();
        ev.charge();

        System.out.println();

        //Petrol Vehicle Input
        System.out.print("Enter Petrol Vehicle Model : ");
        String pvModel = sc.nextLine();
        System.out.print("Enter Max Speed (Petrol) : ");
        int pvSpeed = sc.nextInt();
        System.out.print("Enter Fuel Capacity (liters) : ");
        int fuel = sc.nextInt();

        PetrolVehicle pv = new PetrolVehicle(pvModel, pvSpeed, fuel);
        pv.displayDetails();
        pv.refuel();
	}

}
