package Practice;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        //volume of cylinder
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();

        double volume = Math.PI * Math.pow(r,2) * h;

        System.out.println(volume);
    }
}
