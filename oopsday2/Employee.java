package accsessmodifier_package;

public class Employee {
	
    // Public variable
    public int employeeID;

    // Protected variable
    protected String department;

    // Private variable
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method 
    public double getSalary() {
        return salary;
    }

    // Public method
    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
            System.out.println("Salary updated to Rs" + newSalary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Method to display employee info
    public void displayEmployeeInfo() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : Rs" + salary);
    }
}

