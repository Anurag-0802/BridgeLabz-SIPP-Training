package constructor_package;

public class MainPerson {
    public static void main(String[] args) {

        // Creating original person using parameterized constructor
        Person original = new Person("Alice", 30);
        System.out.println("Original Person:");
        original.displayInfo();

        System.out.println();

        // Creating a copy of the original person using copy constructor
        Person copy = new Person(original);
        System.out.println("Copied Person:");
        copy.displayInfo();
    }
}