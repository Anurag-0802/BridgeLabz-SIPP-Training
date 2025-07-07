abstract class Employee {
	private int employeeID;
	private String name;
	private double baseSalary;
	
	Employee(int employeeID, String name, double baseSalary) {
		this.employeeID = employeeID;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	//Getters and Setters
	public int getEmployeeID() {
		return employeeID;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	//Abstract Method
	public abstract double calculateSalary();
	
	//Concrete Method
	public void displayDetails() {
		System.out.println("ID : " + employeeID);
        System.out.println("Name : " + name);
        System.out.println("Base Salary : " + baseSalary);
        System.out.println("Total Salary : " + calculateSalary());
	}
}

//Department Interface
interface Department {
	void assignDepartment(String deptName);
	String getDepartmentDetails();
}

//FullTimeEmployee Subclass
class FullTimeEmployee extends Employee implements Department {
	private String department;
	private double bonus;
	
	FullTimeEmployee(int ID, String name, double baseSalary, double bonus) {
		super(ID, name, baseSalary);
		this.bonus = bonus;
	}
	
	@Override
	public double calculateSalary() {
		return getBaseSalary() + bonus;
	}
	
	@Override
	public void assignDepartment(String deptName) {
		this.department = deptName;
	}
	
	@Override
	public String getDepartmentDetails() {
		return "Department : " + department;
	}
}

//PartTimeEmployee Subclass

class PartTimeEmployee extends Employee implements Department {
	private String department;
	private int hoursWorked;
	private double hourlyRate;
	
	PartTimeEmployee(int ID, String name, double baseSalary, int hoursWorked, double hourlyRate) {
		super(ID, name, baseSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double calculateSalary() {
		return getBaseSalary() + (hoursWorked * hourlyRate);
	}
	
	@Override
	public void assignDepartment(String deptName) {
		this.department = deptName;
	}
	
	@Override
	public String getDepartmentDetails() {
		return "Department : " + department;
	}
}
