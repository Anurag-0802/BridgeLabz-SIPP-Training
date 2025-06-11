package Practice;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        // kilometers to miles
        Scanner sc = new Scanner(System.in);
        int Kilometers = sc.nextInt();

        int Miles = (int) (Kilometers * 0.621371);

        System.out.print(Miles);
    }
}
