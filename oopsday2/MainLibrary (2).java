package constructor_package;

public class MainLibrary {
    public static void main(String[] args) {
        BookLibrary book1 = new BookLibrary("1984", "George Orwell", 15.99, true);
        
        book1.displayBookInfo();
        book1.borrowBook();  // First borrow
        book1.displayBookInfo();
        book1.borrowBook();  // Try borrowing again
    }
}

