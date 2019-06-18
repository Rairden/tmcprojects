import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input = "Mikael\n" +
                "Mika\n" + "\n" +
                "jump\n" +
                "jump\n" +
                "jump\n" +
                "quit\n";
        Scanner scan = new Scanner(input);
        UserInterface ui = new UserInterface(scan);
        ui.start();
    }
}
