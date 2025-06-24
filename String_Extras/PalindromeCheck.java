import java.util.*;
public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().trim();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindrome(str) ? "Palindrome" : "Not a palindrome");
    }
}
