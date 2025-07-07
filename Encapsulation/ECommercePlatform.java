import java.util.*;
public class ECommercePlatform {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<>();

        System.out.print("Enter number of products : ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nProduct " + (i + 1));
            System.out.print("Enter product type (1-Electronics, 2-Clothing, 3-Groceries) : ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product ID : ");
            int ID = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Price : ");
            double price = sc.nextDouble();
            sc.nextLine();

            Product product = null;
            if (type == 1) {
                product = new Electronics(ID, name, price);
            } else if (type == 2) {
                product = new Clothing(ID, name, price);
            } else if (type == 3) {
                product = new Groceries(ID, name, price);
            } else {
                System.out.println("Invalid product type! Skipping...");
                continue;
            }
            productList.add(product);
        }
        
     // Display all products and final price
        System.out.println("\n--- Product Details with Final Prices ---");
        for (Product p : productList) {
            System.out.println("\nProduct ID : " + p.getProductID());
            System.out.println("Name : " + p.getName());
            System.out.println("Price : " + p.getPrice());
            System.out.println("Discount : " + p.calculateDiscount());

            double tax = 0;
            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                tax = t.calculateTax();
                System.out.println("Tax : " + tax);
                System.out.println(t.getTaxDetails());
            } else {
                System.out.println("Tax : 0.0 (Non-taxable item)");
            }

            double finalPrice = p.getPrice() + tax - p.calculateDiscount();
            System.out.println("Final Price : " + finalPrice);
            System.out.println("-------------------------------");
        }
	}
}
