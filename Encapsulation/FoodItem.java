// Abstract class FoodItem (defined first)
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter (encapsulation)
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public String getItemDetails() {
        return "Item : " + itemName + "; Price : Rs." + price + "; Quantity : " + quantity;
    }
}

// Interface Discountable
interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discount / 100);
    }

    @Override
    public void applyDiscount(double percentage) {
        this.discount = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount on Veg Item : " + discount + "%";
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double extraCharge = 25.0; 
    private double discount = 0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + extraCharge) * getQuantity();
        return total - (total * discount / 100);
    }

    @Override
    public void applyDiscount(double percentage) {
        this.discount = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount on Non-Veg Item : " + discount + "%";
    }
}
