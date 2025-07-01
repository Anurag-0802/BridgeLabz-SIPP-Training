package constructor_package;

public class ProductDetailDisplayer {
	
    // Method to display individual product details
    public void displayProductDetails(Product product) {
        System.out.println("Product Name: " + product.productName);
        System.out.println("Price       : " + product.price);
    }
}

