import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input = "Mikael\n" +
                "Mika\n" + "\n" +
                "jump\n" +
                "jump\n" +
                "jump\n" +
                "quit\n";
        String input2 = "Arto\n\njump\njump\nquit\n";
        Scanner scan = new Scanner(System.in);
        UserInterface ui = new UserInterface(scan);
        ui.start();
    }
}
