// LibraryEntities.java

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private String borrowerName;  // Encapsulated field

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setBorrowerName(String name) {
        this.borrowerName = name;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void getItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }

    public abstract int getLoanDuration(); // Abstract Method
}

// Interface
interface Reservable {
    void reserveItem(String name);
    boolean checkAvailability();
}

// Book subclass
class Book extends LibraryItem implements Reservable {
    private boolean isReserved = false;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14; 
    }

    public void reserveItem(String name) {
        if (!isReserved) {
            isReserved = true;
            setBorrowerName(name);
            System.out.println("Book reserved successfully for " + name);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Magazine subclass
class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved = false;

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7; 
    }

    public void reserveItem(String name) {
        if (!isReserved) {
            isReserved = true;
            setBorrowerName(name);
            System.out.println("Magazine reserved successfully for " + name);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !isReserved;
    }
}

// DVD subclass
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved = false;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 3; 
    }

    public void reserveItem(String name) {
        if (!isReserved) {
            isReserved = true;
            setBorrowerName(name);
            System.out.println("DVD reserved successfully for " + name);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !isReserved;
    }
}
