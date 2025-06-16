import java.util.Scanner;

public class totalBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        double[] salary = new double[n];
        double[] bonus = new double[n];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < n; i++) {
            double s = sc.nextDouble();
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                i--; 
                continue;
            }

            salary[i] = s;
            salary[i] = s;
            if (y > 5)
                bonus[i] = s * 0.05;
            else
                bonus[i] = s * 0.02;

            totalBonus += bonus[i];
            totalOldSalary += s;
            totalNewSalary += (s + bonus[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Emp " + (i + 1) + " | Old: " + salary[i] + " | Bonus: " + bonus[i] + " | New: " + (salary[i] + bonus[i]));
        }

        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
