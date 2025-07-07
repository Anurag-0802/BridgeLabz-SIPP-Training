class Device {
    String deviceID;
    String status;

    // Constructor
    Device(String deviceID, String status) {
        this.deviceID = deviceID;
        this.status = status;
    }

    // Method to display device status
    void displayStatus() {
        System.out.println("Device ID : " + deviceID);
        System.out.println("Status : " + status);
    }
}

//Thermostat Subclass
class Thermostat extends Device {
    double temperatureSetting;

    // Constructor
    Thermostat(String deviceID, String status, double temperatureSetting) {
        super(deviceID, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Override displayStatus
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting : " + temperatureSetting + "°C");
    }
}