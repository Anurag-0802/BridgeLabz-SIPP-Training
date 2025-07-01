package constructor_package;

public class InstituteUpdater {
	
    // Class method to update institute name
    public void updateInstituteName(String newName) {
        Course.instituteName = newName;
        System.out.println("Institute name updated to: " + Course.instituteName);
    }
}

