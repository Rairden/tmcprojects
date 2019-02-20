import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // this is a comments
        Scanner scan = new Scanner(System.in);
        UserInterface ui = new UserInterface(scan);

        ui.start();

    }
}