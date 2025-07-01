package constructor_package;

public class BookLibrary {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Constructor
    public BookLibrary(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have successfully borrowed \"" + title + "\" by " + author + ".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    // Method to display book details
    public void displayBookInfo() {
        String status = availability ? "Available" : "Not Available";
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
    }
}

