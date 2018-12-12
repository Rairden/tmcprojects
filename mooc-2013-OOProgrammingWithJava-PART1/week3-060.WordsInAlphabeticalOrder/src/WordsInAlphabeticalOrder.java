import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class WordsInAlphabeticalOrder {
    /**
     *Create a similar program as the previous one, but in which the words are printed in alphabetical order.
     * Type a word: Mozart
     * Type a word: Schubert
     * Type a word: Bach
     * Type a word:
     * You typed the following words:
     * Bach
     * Mozart
     * Schubert
     */

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type a word: ");
            String str = reader.nextLine();
            words.add(str);
            if (str.isEmpty()) {
                break;
            }
        }

        Collections.sort(words);
        System.out.println("You typed the following words:");
        for (String x : words) {
            System.out.println(x);
        }
    }
}
