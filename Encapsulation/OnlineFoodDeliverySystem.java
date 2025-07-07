import java.util.Scanner;
public class OnlineFoodDeliverySystem {
	
	// Polymorphic method
    public static void processOrder(FoodItem item) {
        System.out.println("\n--- Order Summary ---");
        System.out.println(item.getItemDetails());
        System.out.printf("Total Price: ₹%.2f%n", item.calculateTotalPrice());
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- Online Food Delivery System ----");
        System.out.print("Enter item type (Veg / NonVeg) : ");
        String type = sc.nextLine();

        System.out.print("Enter item name : ");
        String name = sc.nextLine();

        System.out.print("Enter item price : Rs.");
        double price = sc.nextDouble();

        System.out.print("Enter quantity : ");
        int quantity = sc.nextInt();

        System.out.print("Enter discount percentage : ");
        double discount = sc.nextDouble();

        FoodItem item = null;

        if (type.equalsIgnoreCase("Veg")) {
            item = new VegItem(name, price, quantity);
        } else if (type.equalsIgnoreCase("NonVeg")) {
            item = new NonVegItem(name, price, quantity);
        } else {
            System.out.println("Invalid item type.");
            return;
        }

        if (item instanceof Discountable) {
            ((Discountable) item).applyDiscount(discount);
            System.out.println(((Discountable) item).getDiscountDetails());
        }
        processOrder(item);
	}

}
