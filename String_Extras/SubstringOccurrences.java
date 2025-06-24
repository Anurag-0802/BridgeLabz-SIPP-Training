public class SubstringOccurrences {

    public static int countOccurrences(String str, String substr) {
        int count = 0;
        for (int i = 0; i <= str.length() - substr.length(); i++) {
            if (str.substring(i, i + substr.length()).equals(substr))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Occurrences: " + countOccurrences("hello hello world", "hello"));
    }
}
