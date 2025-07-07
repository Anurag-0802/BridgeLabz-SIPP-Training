class Order {
	protected int orderID;
	protected String orderDate;
	
	Order(int orderID, String orderDate) {
		this.orderID = orderID;
		this.orderDate = orderDate;
	}
	
	public void display() {
		System.out.println("Order ID  : " + orderID);
		System.out.println("Order Date : " + orderDate);
	}
	
	public String getOrderStatus() {
		return "Order Placed";
	}
}

//Shipped Subclass
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tracking Number : " + trackingNumber);
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}

//DeliverOrder Subclass
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);  
        this.deliveryDate = deliveryDate;
    }

    // Overriding method
    @Override
    public void display() {
        super.display();
        System.out.println("Delivery Date : " + deliveryDate);
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }
}
