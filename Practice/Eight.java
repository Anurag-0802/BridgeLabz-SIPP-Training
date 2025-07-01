package Practice;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        //Average of three numbers
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = (a+b+c)/3;

        System.out.print(avg);

    }
}
