import java.util.Scanner;

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String mName, dName, iName, progLang, clgName;
		int mID, teamSize, dID, iID;
		double mSalary, dSalary, iSalary;
		
		//Manager User Input
		System.out.println("\nEnter Manager Details : ");
		System.out.println("Manager's Name : ");
		mName = sc.nextLine();
		System.out.println("Manager's ID : ");
		mID = sc.nextInt();
		sc.nextLine();
		System.out.println("Manager's Salary : Rs.");
		mSalary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Team Size : ");
		teamSize = sc.nextInt();
		sc.nextLine();
		
		//Object for subclass manager
		Manager mang = new Manager(mName, mID, mSalary, teamSize);
		
		//Developer User Input
		System.out.println("\nEnter Developer Details : ");
	    System.out.println("Developer's Name : ");
		dName = sc.nextLine();
		System.out.println("Developer's ID : ");
		dID = sc.nextInt();
		sc.nextLine();
		System.out.println("Developer's Salary : Rs.");
		dSalary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Programming Language : ");
		progLang = sc.nextLine();
				
		//Object for subclass developer
		Developer devp = new Developer(dName, dID, dSalary, progLang);
		
		//Intern User Input
		System.out.println("\nEnter Intern Details : ");
		System.out.println("Intern's Name : ");
		iName = sc.nextLine();
		System.out.println("Intern's ID : ");
		iID = sc.nextInt();
		sc.nextLine();
		System.out.println("Intern's Salary : Rs.");
		iSalary = sc.nextDouble();
		sc.nextLine();
		System.out.println("College Name : ");
		clgName = sc.nextLine();
						
		//Object for subclass intern
		Intern intern = new Intern(iName, iID, iSalary, clgName);
		
		// Display all details
        System.out.println("\n--- Manager Details ---");
        mang.display();

        System.out.println("\n--- Developer Details ---");
        devp.display();

        System.out.println("\n--- Intern Details ---");
        intern.display();

	}

}
