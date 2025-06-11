package Practice;

import java.util.*;
public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in celsius :");
        int c = sc.nextInt();
        int f = (c* 9/5) + 32;

        System.out.println(f);
    }
}
