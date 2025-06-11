package Practice;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        //simple interest
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        int SI = (p*r*t)/100;

        System.out .print(SI);
    }
}
