class Book {
	String title;
	int publicationYear;
	
	//Constructor
	Book(String title, int publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;
	}
	
	//Method to display book information
	void displayInfo() {
		System.out.println("Title : " + title);
		System.out.println("Publication Year : " + publicationYear);
	}
}

//Author Subclass
class Author extends Book {
	String name;
	String bio;
	
	Author (String title, int publicationYear, String name, String bio) {
		super(title, publicationYear);
		this.name = name;
		this.bio = bio;
	}
	
	// Override displayInfo to include author info
	@Override
	void displayInfo() {
        super.displayInfo(); 
        System.out.println("Author Name : " + name);
        System.out.println("Author Bio : " + bio);
    }

}
