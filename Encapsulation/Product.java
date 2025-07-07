abstract class Product {
    private int productID;
    private String name;
    private double price;

    public Product(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters (Encapsulation)
    public int getProductID() { 
    	return productID; 
    }
    public void setProductID(int productID) { 
    	this.productID = productID;
    }

    public String getName() {
    	return name; 
    }
    public void setName(String name) { 
    	this.name = name; 
    }

    public double getPrice() { 
    	return price; 
    }
    
    public void setPrice(double price) { 
    	this.price = price; 
    }

    // Abstract method
    public abstract double calculateDiscount();
}

// Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics class
class Electronics extends Product implements Taxable {
    public Electronics(int productID, String name, double price) {
        super(productID, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; 
    }

    @Override
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}

// Clothing class
class Clothing extends Product implements Taxable {
    public Clothing(int productID, String name, double price) {
        super(productID, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; 
    }

    @Override
    public String getTaxDetails() {
        return "12% GST on Clothing";
    }
}

// Groceries class (Non-taxable for simplicity)
class Groceries extends Product {
    public Groceries(int productID, String name, double price) {
        super(productID, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; 
    }
}
