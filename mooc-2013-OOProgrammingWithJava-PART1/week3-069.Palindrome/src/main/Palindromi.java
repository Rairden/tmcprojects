package main;

import java.util.Scanner;

public class Palindromi {

    /**
     * Create the method palindrome that checks if a string is a palindrome (reads the same forward and backward).
     *
     * The method can use the method reverse (from assignment number 56. Reversing text) as a helper. The method type
     * is boolean, so it returns either true (the string is a palindrome) or false (the string is not a palindrome).
     */

    /**
     * @param text inputs a string
     * @return a string that has been reversed.
     */
    public static String reverse(String text) {
        String str = "";
        for (int i = text.length(); i > 0; i--) {
            str += text.charAt(i - 1);
        }
        return str;
    }

    /**
     * @param text a string to reverse
     * @return TRUE if the string reads the same forward and backward
     */
    public static boolean palindrome(String text) {
        return text.equals(reverse(text));
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type a text: ");
        String text = reader.nextLine();

        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
