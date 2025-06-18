import java.util.Scanner;

public class TrimManual {
    public static String trim(String str) {
        int start = 0, end = str.length() - 1;
        while (start < str.length() && str.charAt(start) == ' ') start++;
        while (end >= 0 && str.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(str.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String manualTrim = trim(input);
        String builtInTrim = input.trim();
        System.out.println("Manual Trimmed: \"" + manualTrim + "\"");
        System.out.println("Built-in Trimmed: \"" + builtInTrim + "\"");
        System.out.println("Match: " + manualTrim.equals(builtInTrim));
    }
}
