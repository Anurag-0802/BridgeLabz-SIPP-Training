package constructor_package;

public class MainCourse {
    public static void main(String[] args) {
    	
        // Create Course objects
        Course c1 = new Course("Java Programming", 8, 5000.0);
        Course c2 = new Course("Web Development", 10, 7000.0);

        // Create helper objects
        CourseDetailDisplayer displayer = new CourseDetailDisplayer();
        InstituteUpdater updater = new InstituteUpdater();

        System.out.println("Course 1 Details:");
        displayer.displayCourseDetails(c1);
        System.out.println();

        System.out.println("Course 2 Details:");
        displayer.displayCourseDetails(c2);
        System.out.println();

        updater.updateInstituteName("SkillTech Academy");
        System.out.println();

        System.out.println("Updated Course 1 Details:");
        displayer.displayCourseDetails(c1);
        System.out.println();

        System.out.println("Updated Course 2 Details:");
        displayer.displayCourseDetails(c2);
    }
}

