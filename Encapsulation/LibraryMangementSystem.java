import java.util.*;
public class LibraryMangementSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        List<LibraryItem> libraryItems = new ArrayList<>();

        System.out.print("How many items do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for item " + (i + 1));
            System.out.print("Enter type (Book / Magazine / DVD) : ");
            String type = sc.nextLine().trim();

            System.out.print("Enter Item ID : ");
            int itemId = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Title : ");
            String title = sc.nextLine();

            System.out.print("Enter Author : ");
            String author = sc.nextLine();

            LibraryItem item = null;

            switch (type.toLowerCase()) {
                case "book":
                    item = new Book(itemId, title, author);
                    break;
                case "magazine":
                    item = new Magazine(itemId, title, author);
                    break;
                case "dvd":
                    item = new DVD(itemId, title, author);
                    break;
                default:
                    System.out.println("Invalid type! Skipping...");
                    continue;
            }

            libraryItems.add(item);
        }
        
        for (LibraryItem item : libraryItems) {
            System.out.println("\n---- Item Details ----");
            item.getItemDetails();
            System.out.println("Loan Duration : " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;

                if (reservableItem.checkAvailability()) {
                    System.out.print("Enter your name to reserve this item : ");
                    String name = sc.nextLine();
                    reservableItem.reserveItem(name);
                } else {
                    System.out.println("Item already reserved by : " + item.getBorrowerName());
                }
            }
        }
	}

}
