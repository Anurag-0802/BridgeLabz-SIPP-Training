package constructor_package;

public class Course {
	
    // Instance variable
    String courseName;
    int duration; 
    double fee;

    // Class variable
    static String instituteName = "ABC Learning";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
}

