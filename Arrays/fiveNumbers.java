import java.util.Scanner;

public class fiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0;i<5;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > 0) {
                if(arr[i] %2 == 0) {
                    System.out.println("Number is Positive and Even");
                }else{
                    System.out.println("Number is Postive and Odd");
                }
            }
            else if(arr[i] < 0) {
                System.out.println("Number " + arr[i] + " is Negative");
            }
            else {
                System.out.println("Number is zero");
            }
        }
        int first  = arr[0];
        int last = arr[4];

         System.out.print("Comparison of first and last element: ");
        if (first == last) {
            System.out.println("Equal");
        } else if (first > last) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }
    }
}