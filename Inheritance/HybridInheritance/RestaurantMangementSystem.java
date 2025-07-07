import java.util.Scanner;
public class RestaurantMangementSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Input for Chef
        System.out.print("Enter Chef Name : ");
        String chefName = sc.nextLine();
        System.out.print("Enter Chef ID : ");
        int chefId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Chef Specialty : ");
        String specialty = sc.nextLine();

        Chef chef = new Chef(chefName, chefId, specialty);
        chef.displayInfo();
        chef.performDuties();

        System.out.println();

        // Input for Waiter
        System.out.print("Enter Waiter Name : ");
        String waiterName = sc.nextLine();
        System.out.print("Enter Waiter ID : ");
        int waiterId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Waiter Shift (Morning/Evening) : ");
        String shift = sc.nextLine();

        Waiter waiter = new Waiter(waiterName, waiterId, shift);
        waiter.displayInfo();
        waiter.performDuties();
	}

}
