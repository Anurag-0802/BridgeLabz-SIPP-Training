package accsessmodifier_package;

public class Manager extends Employee {

    private String projectName;

    public Manager(int employeeID, String department, double salary, String projectName) {
        super(employeeID, department, salary);
        this.projectName = projectName;
    }

    // Method to display manager details
    public void displayManagerInfo() {
        System.out.println("Manager Info:");
        System.out.println("Employee ID : " + employeeID);  
        System.out.println("Department  : " + department);   
        System.out.println("Project     : " + projectName);
        System.out.println("Salary      : Rs" + getSalary()); 
    }
}

