public class VowelConsonantCounter {

    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        String input = "Hello World";
        int[] result = countVowelsAndConsonants(input);
        System.out.println("Vowels: " + result[0] + ", Consonants: " + result[1]);
    }
}
