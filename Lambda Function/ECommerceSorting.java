import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    public Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("Product{name='%s', price=%.2f, rating=%.1f, discount=%.1f%%}", 
                              name, price, rating, discount);
    }
}

public class ECommerceSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<Product> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + " : ");
            System.out.print("Name : ");
            String name = sc.nextLine();
            System.out.print("Price : ");
            double price = sc.nextDouble();
            System.out.print("Rating : ");
            double rating = sc.nextDouble();
            System.out.print("Discount (%) : ");
            double discount = sc.nextDouble();
            sc.nextLine(); 
            products.add(new Product(name, price, rating, discount));
        }

        System.out.println("\nSort by : 1. Price  2. Rating  3. Discount");
        int choice = sc.nextInt();

        Comparator<Product> comparator = null;

        switch (choice) {
            case 1:
                comparator = Comparator.comparingDouble(p -> p.price);
                break;
            case 2:
                comparator = Comparator.comparingDouble((Product p) -> p.rating).reversed();
                break;
            case 3:
                comparator = Comparator.comparingDouble((Product p) -> p.discount).reversed();
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        products.sort(comparator);

        System.out.println("\nSorted Products:");
        products.forEach(System.out::println);

        sc.close();
    }
}
