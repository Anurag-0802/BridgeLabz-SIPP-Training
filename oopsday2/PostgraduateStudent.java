package constructor_package;

public class PostgraduateStudent extends Student {

    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Display PG student info using protected name from parent class
    public void displayPGInfo() {
        System.out.println("Postgraduate Student:");
        System.out.println("Roll Number   : " + rollNumber);
        System.out.println("Name          : " + name); 
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA          : " + getCGPA());
    }
}

