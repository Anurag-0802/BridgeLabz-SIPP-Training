package constructor_package;

public class Person {

    // Attributes
    String name;
    int age;

    // Default constructor
    public Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    // Method to display person's info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}
