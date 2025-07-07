import java.util.Scanner;

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("Enter Course Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Duration (in hours) : ");
        int duration = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Platform Name: ");
        String platform = sc.nextLine();

        System.out.print("Is the course recorded? (true/false) : ");
        boolean isRecorded = sc.nextBoolean();

        System.out.print("Enter Course Fee : ");
        double fee = sc.nextDouble();

        System.out.print("Enter Discount (%) : ");
        double discount = sc.nextDouble();

        // Create object and display
        PaidOnlineCourse poc = new PaidOnlineCourse(name, duration, platform, isRecorded, fee, discount);
        System.out.println("\n---- Course Details ----");
        poc.displayPaidCourse();
    }
}