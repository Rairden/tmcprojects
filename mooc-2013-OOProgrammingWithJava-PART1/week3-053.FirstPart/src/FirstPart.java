
import java.util.Scanner;

/**
 * Create a program that prints the first part of a word. The program asks the user for the word
 * and the length of the first part. Use the substring method in your program.
 *
 * Type a word: example
 * Length of the first part: 4
 * Result: exam
 */

public class FirstPart {

    public static void main(String[] args) {

        System.out.print("Type a word: ");
        Scanner reader = new Scanner(System.in);

    //  String str2 = "123456789";
    //  String str1 = "erik";
        String str = reader.nextLine();

        System.out.print("Length of the first part: ");
        int length = reader.nextInt();

        System.out.print("Result: ");
        System.out.print(str.substring(0,length));
    }
}
