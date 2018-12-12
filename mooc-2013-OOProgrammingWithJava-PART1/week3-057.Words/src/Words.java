import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    /**
     * Create a program that asks the user to input words until the user types in an empty String. Then the program
     * prints the words the user gave. Try the for repetition sentence here. Use an ArrayList structure in your
     * program.
     * Type a word: Mozart
     * Type a word: Schubert
     * Type a word: Bach
     * Type a word:
     * You typed the following words:
     * Mozart
     * Schubert
     * Bach
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

        System.out.println("You typed the following words:");
        for (String x : words) {
            System.out.println(x);
        }
    }
}
