package constructor_package;

public class CourseDetailDisplayer {
	
    // Instance method to display course details
    public void displayCourseDetails(Course course) {
        System.out.println("Course Name   : " + course.courseName);
        System.out.println("Duration      : " + course.duration + " weeks");
        System.out.println("Fee           : " + course.fee);
        System.out.println("Institute Name: " + Course.instituteName);
    }
}

