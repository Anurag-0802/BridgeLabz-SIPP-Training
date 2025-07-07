import java.util.Scanner;
public class SmartHomeDevices {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ID, status;
		double temp;
		
		System.out.print("Enter Device ID : ");
        ID = sc.nextLine();
        System.out.print("Enter Device Status (ON/OFF) : ");
        status = sc.nextLine();
        System.out.print("Enter Temperature Setting (°C) : ");
        temp = sc.nextDouble();
        sc.nextLine();
        
        // Create Thermostat object
        Thermostat t = new Thermostat(ID, status, temp);

        System.out.println("\n---- Thermostat Device Info ----");
        t.displayStatus();
	}
}
