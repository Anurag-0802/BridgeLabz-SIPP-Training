import java.util.*;

public class RemoveSpecificChar {
    public static String RemoveChar(String str, char ch) {
        str = str.replace(Character.toString(ch), "");
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String str = "Hello World";
        System.out.println("Updated String After Removing Specific Character is : "+ RemoveChar(str, ch));
    }
}