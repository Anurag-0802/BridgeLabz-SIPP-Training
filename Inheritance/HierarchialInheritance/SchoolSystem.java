import java.util.Scanner;
public class SchoolSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Input for Teacher
        System.out.print("Enter Teacher's Name : ");
        String tName = sc.nextLine();
        System.out.print("Enter Age : ");
        int tAge = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Subject : ");
        String subject = sc.nextLine();
        Teacher teacher = new Teacher(tName, tAge, subject);

        // Input for Student
        System.out.print("\nEnter Student's Name : ");
        String sName = sc.nextLine();
        System.out.print("Enter Age : ");
        int sAge = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Grade : ");
        String grade = sc.nextLine();
        Student student = new Student(sName, sAge, grade);

        // Input for Staff
        System.out.print("\nEnter Staff's Name : ");
        String stName = sc.nextLine();
        System.out.print("Enter Age : ");
        int stAge = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Department : ");
        String department = sc.nextLine();
        Staff staff = new Staff(stName, stAge, department);

        // Display roles
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
	}

}
