package Practice;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        //Area of rectangle
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();

        int peri = 2*(length+width);
        System.out.print(peri);
    }
}
