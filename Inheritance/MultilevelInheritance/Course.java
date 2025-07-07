class Course {
    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourse() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration (hours) : " + duration);
    }
}

// Subclass of Course
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public void displayOnlineCourse() {
        displayCourse();
        System.out.println("Platform : " + platform);
        System.out.println("Is Recorded : " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass of OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // in percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void displayPaidCourse() {
        displayOnlineCourse();
        System.out.println("Course Fee : Rs." + fee);
        System.out.println("Discount : " + discount + "%");
        double finalFee = fee - (fee * discount / 100);
        System.out.println("Final Fee After Discount : Rs." + finalFee);
    }
}