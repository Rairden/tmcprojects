import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private Map<String, Jump> jumpMap;

    public UserInterface(Scanner scan) {
        this.scan = new Scanner(System.in);
        this.jumpMap = new HashMap<>();
    }

    public void start() {
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; " +
                           "an empty string brings you to the jumping phase.");

        while (true) {
            System.out.print("Participant name: ");
            String name = scan.nextLine();
            if (name.equals("")) {
                break;
            }
            Jump jump = new Jump();
            jumpMap.putIfAbsent(name, jump);

        }
        System.out.println();
        System.out.println("The tournament begins!\n");

        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = scan.nextLine();

            if (command.equals("")) {   // if they press Enter, then print results
                break;
            }

            int round = 1;
            if (command.equals("jump")) {
                System.out.println();
                System.out.println("Round " + round + "\n");
                System.out.println("Jumping order:");

                for (String s : jumpMap.keySet()) {
                    System.out.println("  " + s.indexOf(s) + ". " + s + "(" + jumpMap.);
                }

            }

        }







    }
}