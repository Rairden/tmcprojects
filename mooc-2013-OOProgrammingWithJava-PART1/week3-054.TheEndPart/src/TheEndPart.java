
import java.util.Scanner;

/**
 * Create a program that prints the end part of a word.
 * The program asks the user for the word and the length of the end part.
 * Use the substring method in your program.
 *
 * Type a word: example
 * Length of the first part: 4
 * Result: mple
 */

public class TheEndPart {

    public static void main(String[] args) {

        System.out.print("Type a word: ");
        Scanner reader = new Scanner(System.in);

        String str2 = "012345678";
    //  String str1 = "erik";
    //  String str = reader.nextLine();

        System.out.print("Length of the first part: ");
        int length = reader.nextInt();  // If I input = 4, why do I have to decrement it?
        length--;

        System.out.print("Result: ");
        int startIndex = str2.length() - length;
/*
              6        =       9 - 3
                             012345678
          startIndex is..         *
     So why do I subtract 1 below?  Guess to start at index 5.
*/

        System.out.print(str2.substring(startIndex-1, str2.length()));
    }
}
