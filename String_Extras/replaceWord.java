import java.util.*;

public class replaceWord{
    public static String replaceWords(String sentence, String oldWord, String newWord){
        return sentence.replace(oldWord,newWord);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Sentence : ");
        String sentence = sc.nextLine();

        System.out.println("Enter word to replace :");
        String oldWord = sc.next();

        System.out.println("Enter newWord :");
        String newWord = sc.next();

        System.out.print(replaceWords(sentence, oldWord, newWord));


    }
}