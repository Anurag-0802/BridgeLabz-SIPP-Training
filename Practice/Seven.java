package Practice;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        //power of two number
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int expo = sc.nextInt();

        int power = (int) Math.pow(base,expo);
        System.out.print(power);
    }
}
