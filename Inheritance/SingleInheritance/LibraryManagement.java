import java.util.Scanner;

public class LibraryManagement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String title, name, bio;
		int publicationYear;
		
		System.out.print("Enter the title : ");
		title = sc.nextLine();
		System.out.print("Enter thr publication year : ");
		publicationYear = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter author name : ");
		name = sc.nextLine();
		System.out.print("Enter Author Bio : ");
		bio = sc.nextLine();
		
		//Create object for class author
		Author authorBook = new Author(title, publicationYear, name, bio);
		System.out.println("\n---- Book & Author Details ----");
        authorBook.displayInfo();
	}

}
