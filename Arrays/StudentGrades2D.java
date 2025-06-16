import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3]; 
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                double mark;
                do {
                    System.out.print("  " + subject + ": ");
                    mark = sc.nextDouble();
                    if (mark < 0) {
                        System.out.println("  Marks must be positive. Please enter again.");
                    }
                } while (mark < 0);
                marks[i][j] = mark;
            }
        }

        for (int i = 0; i < n; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (total / 300.0) * 100;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        System.out.println("\nStudent  Physics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(
                (i + 1) + "        " +
                marks[i][0] + "      " +
                marks[i][1] + "        " +
                marks[i][2] + "     " +
                percentages[i] + "%     " +
                grades[i]
            );
        }
    }
}