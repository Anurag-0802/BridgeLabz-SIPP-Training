class Employee {
	protected String name;
	protected int ID;
	protected double salary;
	
	//Constructor
	Employee(String name, int ID, double salary) {
		this.name = name;
		this.ID = ID;
		this.salary = salary;
	}
	
	//Method for employee details
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("ID : " + ID);
		System.out.println("Salary : Rs." + salary);
	}
}

//Manager Subclass
class Manager extends Employee {
	private int teamSize;
	
	//Constructor
	Manager(String name, int ID, double salary, int teamSize) {
		super(name, ID, salary);
		this.teamSize = teamSize;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Team size : " + teamSize);
		System.out.println("Position : Manager");
	}
}

//Developer subclass
class Developer extends Employee {
	private String programmingLanguage;
	
	//Constructor
	Developer(String name, int ID, double salary, String programmingLanguage) {
		super(name, ID, salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Programming Language : " + programmingLanguage);
		System.out.println("Position : Developer");
	}
}

//Intern Subclass
class Intern extends Employee {
	private String collegeName;
	
	Intern(String name, int ID, double salary, String collegeName) {
		super(name, ID, salary);
		this.collegeName = collegeName;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("College : " + collegeName);
		System.out.println("Position : Intern");
	}
}

