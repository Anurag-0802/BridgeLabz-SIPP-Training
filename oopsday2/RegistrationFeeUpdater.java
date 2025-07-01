package constructor_package;

public class RegistrationFeeUpdater {
	
    // Class method to update the registration fee
    public void updateRegistrationFee(double newFee) {
        Vehicle.registrationFee = newFee;
        System.out.println("Registration fee updated to " + newFee);
    }
}

