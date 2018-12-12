import java.util.Scanner;

public class FirstCharacters {

    /** Create a program that asks for the user's name and gives its first, second and third characters separately.
     * If the name length is less than three, the program prints nothing.
     * You do not need to create methods in this exercise.
     *
     * Type your name: Paul
     * 1. character: P
     * 2. character: a
     * 3. character: u
     */

    public static void main(String[] args) {
        System.out.println("Type your name:");
        Scanner reader = new Scanner(System.in);

        String text = reader.nextLine();

        while (text.length() <= 2) {
            return;
        }
        for (int i = 1; i < 4; i++) {
            System.out.println(i + ". character: " + text.charAt(i-1));
        }

    }

}
