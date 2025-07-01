package accsessmodifier_package;

public class MainEmployee {
    public static void main(String[] args) {
    	
        // Create an Employee object
        Employee emp = new Employee(101, "HR", 35000.0);
        System.out.println("Employee Info:");
        emp.displayEmployeeInfo();
        System.out.println();

        emp.setSalary(38000.0); 
        System.out.println("Updated Salary: Rs" + emp.getSalary());
        System.out.println();

        // Create a Manager object
        Manager mgr = new Manager(201, "IT", 75000.0, "Software Developer");
        mgr.displayManagerInfo();

        System.out.println();
        mgr.setSalary(80000.0);
        System.out.println("Updated Manager Salary: Rs" + mgr.getSalary());
    }
}

