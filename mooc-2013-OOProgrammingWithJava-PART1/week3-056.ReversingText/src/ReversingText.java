
import java.util.Scanner;

public class ReversingText {

    /**
     * @param text inputs a string
     * @return str  Returns a string that has been reversed.
     */

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        String str = "";
        for (int i = text.length(); i > 0; i--) {
            str += text.charAt(i - 1);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();

        System.out.println("In reverse order: " + reverse(text));
    }
}
