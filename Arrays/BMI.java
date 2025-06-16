import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();

        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Enter weight (in kg): ");
            weights[i] = scanner.nextDouble();

            System.out.print("Enter height (in meters): ");
            heights[i] = scanner.nextDouble();

            if (weights[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input. Try again.");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            bmi[i] = weights[i] / (heights[i] * heights[i]);

            if (bmi[i] <= 18.4) status[i] = "Underweight";
            else if (bmi[i] <= 24.9) status[i] = "Normal";
            else if (bmi[i] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) +
                " - Height: " + heights[i] + " m" +
                ", Weight: " + weights[i] + " kg" +
                ", BMI: " + String.format("%.2f", bmi[i]) +
                ", Status: " + status[i]);
        }
    }
}