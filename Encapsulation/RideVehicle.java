//Abstract Class RideVehicle
abstract class RideVehicle {
	private String vehicleId;
	private String driverName;
	private double ratePerKm;
	
	RideVehicle(String vehicleId, String driverName, double ratePerKm) {
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		this.ratePerKm = ratePerKm;
	}

	// Encapsulated Getters & Setters
	public String getVehicleId() { 
		return vehicleId; 
	}
	
	public void setVehicleId(String vehicleId) { 
		this.vehicleId = vehicleId; 
	}

	public String getDriverName() { 
		return driverName; 
	}
	
	public void setDriverName(String driverName) { 
		this.driverName = driverName; 
	}

	public double getRatePerKm() { 
		return ratePerKm; 
	}
	
	public void setRatePerKm(double ratePerKm) { 
		this.ratePerKm = ratePerKm; 
	}

	// Abstract method
	public abstract double calculateFare(double distance);

	// Concrete method
	public void getVehicleDetails() {
		System.out.println("Vehicle ID : " + vehicleId);
		System.out.println("Driver Name : " + driverName);
		System.out.println("Rate per Km : Rs." + ratePerKm);
	}
}

//Interface GPS
interface GPS {
	String getCurrentLocation();
	void updateLocation(String newLocation);
}

//Car Class
class Cars extends RideVehicle implements GPS {
	private String currentLocation;

	Cars(String vehicleId, String driverName, double ratePerKm) {
		super(vehicleId, driverName, ratePerKm);
		this.currentLocation = "Garage";
	}

	@Override
 	public double calculateFare(double distance) {
     	return getRatePerKm() * distance + 50; 
 	}

 	@Override
 	public String getCurrentLocation() {
     	return currentLocation;
 	}

 	@Override
 	public void updateLocation(String newLocation) {
     	this.currentLocation = newLocation;
 	}
}

//Bike Class
class Bikes extends RideVehicle implements GPS {
	private String currentLocation;

	Bikes(String vehicleId, String driverName, double ratePerKm) {
		super(vehicleId, driverName, ratePerKm);
		this.currentLocation = "Garage";
	}

	@Override
	public double calculateFare(double distance) {
		return getRatePerKm() * distance + 20; 
	}

	@Override
	public String getCurrentLocation() {
		return currentLocation;
	}

	@Override
	public void updateLocation(String newLocation) {
		this.currentLocation = newLocation;
	}
}

//Auto Class
class Auto extends RideVehicle implements GPS {
	private String currentLocation;

	Auto(String vehicleId, String driverName, double ratePerKm) {
		super(vehicleId, driverName, ratePerKm);
		this.currentLocation = "Garage";
	}

	@Override
	public double calculateFare(double distance) {
		return getRatePerKm() * distance + 30; // ₹30 base fare
	}

	@Override
	public String getCurrentLocation() {
		return currentLocation;
	}

	@Override
	public void updateLocation(String newLocation) {
		this.currentLocation = newLocation;
	}
}


