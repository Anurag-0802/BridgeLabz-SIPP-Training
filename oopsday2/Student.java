package constructor_package;

public class Student {
	
    // Public variable
    public int rollNumber;

    // Protected variable
    protected String name;

    // Private variable
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public getter
    public double getCGPA() {
        return CGPA;
    }

    // Public setter 
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value. It must be between 0 and 10.");
        }
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("CGPA       : " + CGPA);
    }
}

