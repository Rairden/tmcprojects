
import java.util.Scanner;

/**
 * Create a program that asks the user for two words.
 * Then the program tells if the second word is included in the first word.
 * Use String method indexOf in your program.
 *
 * Type the first word: glitter
 * Type the second word: litter
 * The word 'litter' is found in the word 'glitter'.
 * or output...
 * The word 'clean' is not found in the word 'glitter'.
 */

public class WordInsideWord {
    public static void main(String[] args) {

        System.out.print("Type the first word: ");
        Scanner reader = new Scanner(System.in);
        String str1 = reader.nextLine();

        System.out.print("Type the second word: ");
        String str2 = reader.nextLine();

        // 1. search str for that index, and return index
        int foundStartIndex = str1.indexOf(str2);

        if (foundStartIndex == -1) {        // if the first char isn't even found, then game over.
            System.out.println("The word '" + str2 + "' is not found in the word '" + str1 + "'.");
        } else {
            int addLength = str2.length() + foundStartIndex;
            String iteratedOver = str1.substring(foundStartIndex, addLength);

            if (iteratedOver.equals(str2))
                System.out.println("The word '" + str2 + "' is found in the word '" + str1 + "'.");
            else
                System.out.println("The word '" + str2 + "' is not found in the word '" + str1 + "'.");
        }
    }
}
