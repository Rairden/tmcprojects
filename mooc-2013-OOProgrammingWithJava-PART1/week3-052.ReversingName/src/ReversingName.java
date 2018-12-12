import java.util.Scanner;

public class ReversingName {

    /**
     * Create a program that asks for the user's name and prints it in reverse order.
     * You do not need to create a separate method for this.
     *
     * Type your name: Paul
     * In reverse order: luaP
     */

    public static void main(String[] args) {

        System.out.print("Type your name: ");
        Scanner reader = new Scanner(System.in);

        String text = reader.nextLine();
    //  String text2 = "erik";
        System.out.print("In reverse order: ");
        for (int i = text.length(); i > 0; i--) {
            System.out.print(text.charAt(i-1));
        }

    }

}