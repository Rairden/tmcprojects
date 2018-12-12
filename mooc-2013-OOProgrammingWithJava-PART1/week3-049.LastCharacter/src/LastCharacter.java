import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {

        System.out.println("Type your name:");

        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();

        System.out.println(lastCharacter(str));
    }

    /**
     @param text     read in string of text
     @return char    Returns index[n-1] of string, or last character
     */
    public static char lastCharacter(String text) {

        char character = text.charAt(text.length() - 1);
        return character;
    }

}
