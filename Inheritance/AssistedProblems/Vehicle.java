class Vehicle {
	protected int maxSpeed;
	protected String fuelType;
	
	Vehicle(int maxSpeed, String fuelType) {
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	public void displayInfo() {
		System.out.println("Maximum Speed : " + maxSpeed + " km/h");
		System.out.println("Fuel Type : " + fuelType);
	}
}

//Car Subclass
class Car extends Vehicle {
	private int seatCapacity;
	
	Car(int maxSpeed, String fuelType, int seatCapacity) {
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Vehicle Type : Car");
		super.displayInfo();
		System.out.println("Seat Capacity : " + seatCapacity);
	}
}

//Truck Subclass
class Truck extends Vehicle {
	private int loadCapacity;
	
	Truck(int maxSpeed, String fuelType, int loadCapacity) {
		super(maxSpeed, fuelType);
		this.loadCapacity = loadCapacity;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Vehicle Type : 	Truck");
		super.displayInfo();
		System.out.println("Seat Capacity : " + loadCapacity + " kg");
	}
}

//Motorcycle Subclass
class Motorcycle extends Vehicle {
	private boolean luggageRack;
	
	Motorcycle(int maxSpeed, String fuelType, boolean luggageRack) {
		super(maxSpeed, fuelType);
		this.luggageRack = luggageRack;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Vehicle Type : Motorcycle");
		super.displayInfo();
		System.out.println("Has Carrier : " + (luggageRack ? "Yes" : "No"));
	}
}
