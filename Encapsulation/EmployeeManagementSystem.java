import java.util.*;

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> employeeList = new ArrayList<>();
		
		System.out.print("Enter number of employees : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.println("\nEmployee " + (i + 1));
			System.out.println("Enter employee type (1 - Full Time, 2 - Part Time) : ");
			int type = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter Employee ID : ");
			int ID = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Base Salary : ");
            double baseSalary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Department : ");
            String dept = sc.nextLine();
            
            if (type == 1) {
                System.out.print("Enter Bonus: ");
                double bonus = sc.nextDouble();
                FullTimeEmployee fte = new FullTimeEmployee(ID, name, baseSalary, bonus);
                fte.assignDepartment(dept);
                employeeList.add(fte);
            } else if (type == 2) {
                System.out.print("Enter Hours Worked : ");
                int hours = sc.nextInt();
                System.out.print("Enter Hourly Rate : ");
                double rate = sc.nextDouble();
                PartTimeEmployee pte = new PartTimeEmployee(ID, name, baseSalary, hours, rate);
                pte.assignDepartment(dept);
                employeeList.add(pte);
            } else {
                System.out.println("Invalid employee type! Skipping...");
            }
		}
		
		System.out.println("\n---- Employee Details ----");
        for (Employee emp : employeeList) {
            emp.displayDetails();
            if (emp instanceof Department) {
                Department dept = (Department) emp;
                System.out.println(dept.getDepartmentDetails());
            }
            System.out.println("-------------------------");
        }
	}

}
