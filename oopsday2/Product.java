package constructor_package;

public class Product {
	
    // Instance variable
    String productName;
    double price;

    // Class variable
    static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }
}

