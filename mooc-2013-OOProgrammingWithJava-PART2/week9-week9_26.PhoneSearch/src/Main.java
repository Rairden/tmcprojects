import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ATTENTION: In your program, you can create only one instance of class Scanner!

        String input1 = "1\n" + "pekka\n" + "040-123456\n" +
                "2\n" + "jukka\n" +
                "2\n" + "pekka\n" +
                "1\n" + "pekka\n" + "09-222333\n" +
                "2\n" + "pekka\n" +     // found 2 entries
                "3\n" + "02-444123\n" + // not found
                "3\n" + "09-222333\n" + // found pekka
                "5\n" + "pekka\n" +     // list all info
                "4\n" + "pekka\n" + "ida ekmanintie\n" + "helsinki\n" +  // add addr
                "5\n" + "pekka\n" +     // list all info
                "4\n" + "jukka\n" + "korsontie\n" + "vantaa\n" +        // add addr (street+city)
                "5\n" + "jukka\n" +     // list all info
                "7\n" + "kk\n" +        // lookup name that contains 'kk' pattern (jukka)
                "7\n" + "vantaa\n" +    // lookup pattern should return jukka info
                "7\n" + "seppo\n" +
                "6\n" + "jukka\n" +     // del personal info
                "5\n" + "jukka\n";      // shows jukka has no entry

        Scanner scan = new Scanner(System.in);
        UserInterface ui = new UserInterface(scan);
        ui.start();

    }
}
