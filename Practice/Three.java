package Practice;

import java.util.*;

public class Three {
    public static void main(String[] args) {
        //Area of circle
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        double Area = Math.PI * Math.pow(r,2);

        System.out.println(Area);
    }
}
