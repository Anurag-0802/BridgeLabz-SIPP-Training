class Person {
    String name;
    int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display person info
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Chef class: Inherits from Person and implements Worker
class Chef extends Person implements Worker {
    String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking " + specialty + " dishes.");
    }
}

// Waiter class: Inherits from Person and implements Worker
class Waiter extends Person implements Worker {
    String shift;

    public Waiter(String name, int id, String shift) {
        super(name, id);
        this.shift = shift;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving during the " + shift + " shift.");
    }
}