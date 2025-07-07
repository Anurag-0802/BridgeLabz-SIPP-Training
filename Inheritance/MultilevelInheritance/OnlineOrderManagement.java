import java.util.Scanner;
public class OnlineOrderManagement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int orderID;
		String orderDate, trackingNumber, deliveryDate;
		
		System.out.println("Enter Order ID : ");
		orderID = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Order Date (yyyy-mm-dd) : ");
		orderDate = sc.nextLine();
		System.out.println("Enter Tracking Number : ");
		trackingNumber = sc.nextLine();
		System.out.println("Enter Delivery Date (yyyy-mm-dd) : ");
		deliveryDate = sc.nextLine();
		
		DeliveredOrder order = new DeliveredOrder(orderID, orderDate, trackingNumber, deliveryDate);

        // Displaying order details and status
        System.out.println("\n---- Order Details ----");
        order.display();
        System.out.println("Order Status : " + order.getOrderStatus());
	}
}
