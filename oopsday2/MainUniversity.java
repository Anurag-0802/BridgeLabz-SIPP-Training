package constructor_package;

public class MainUniversity {
    public static void main(String[] args) {
    	
        // Create a normal student
        Student s1 = new Student(101, "Rohit Sharma", 8.7);
        System.out.println("Undergraduate Student Info:");
        s1.displayInfo();

        System.out.println();

        // Create a PG student
        PostgraduateStudent pg = new PostgraduateStudent(201, "Sajal Singh", 9.2, "Data Science");
        pg.displayPGInfo();

        System.out.println();

        // Modify CGPA using setter
        pg.setCGPA(9.5);
        System.out.println("Updated PG Student Info:");
        pg.displayPGInfo();
    }
}

