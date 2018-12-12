import java.util.Scanner;

public class SeparatingCharacters {

    /**
     * Create a program that asks for the user's name and gives its characters separately.
     * You do not need to create methods in this exercise.

     * Type your name: Paul
     * 1. character: P
     * 2. character: a
     * 3. character: u
     * 4. character: l
     */

    public static void main(String[] args) {

        System.out.println("Type your name:");
        Scanner reader = new Scanner(System.in);

        String text = reader.nextLine();

        for (int i = 1; i < text.length()+1; i++) {
            System.out.println(i + ". character: " + text.charAt(i-1));
        }

    }

}