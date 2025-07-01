package constructor_package;

public class MainCircle {
    public static void main(String[] args) {

        // Circle using default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.displayInfo();
        System.out.println();

        // Circle using parameterized constructor
        Circle customCircle = new Circle(5.5);
        System.out.println("Custom Circle:");
        customCircle.displayInfo();
    }
}
