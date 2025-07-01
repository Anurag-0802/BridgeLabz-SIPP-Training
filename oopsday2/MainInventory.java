package constructor_package;

public class MainInventory {
    public static void main(String[] args) {
    	
        // Create Product objects
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Smartphone", 22000.0);
        Product p3 = new Product("Tablet", 18000.0);

        // Create displayer and counter objects
        ProductDetailDisplayer displayer = new ProductDetailDisplayer();
        TotalProductCounter counter = new TotalProductCounter();

        System.out.println("Product 1:");
        displayer.displayProductDetails(p1);
        System.out.println();

        System.out.println("Product 2:");
        displayer.displayProductDetails(p2);
        System.out.println();

        System.out.println("Product 3:");
        displayer.displayProductDetails(p3);
        System.out.println();

        counter.displayTotalProducts();
    }
}

