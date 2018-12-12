import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name:");
        String str = reader.nextLine();
        System.out.println(firstCharacter(str));

    }

    /**
    @param text     read in string of text
    @return char    Returns index[0] of string, or first character
    */
    public static char firstCharacter(String text) {
        char ch = text.charAt(0);
        return ch;
    }
}