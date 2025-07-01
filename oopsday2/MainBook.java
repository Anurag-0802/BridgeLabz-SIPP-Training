package constructor_package;

public class MainBook {
    public static void main(String[] args) {

        // Using default constructor
        Book defaultBook = new Book();
        System.out.println("Book using Default Constructor:");
        defaultBook.displayBookInfo();
        System.out.println();

        // Using parameterized constructor
        Book customBook = new Book("Atomic Habits", "James Clear", 450.00);
        System.out.println("Book using Parameterized Constructor:");
        customBook.displayBookInfo();
    }
}
