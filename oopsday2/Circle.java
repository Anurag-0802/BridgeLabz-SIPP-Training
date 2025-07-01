package constructor_package;

public class Circle {

    // Attribute
    double radius;

    // Default constructor
    public Circle() {
        this(1.0);  
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius and area
    public void displayInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Area  : " + (Math.PI * radius * radius));
    }
}