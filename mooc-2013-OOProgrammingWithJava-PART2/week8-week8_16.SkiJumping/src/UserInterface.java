import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private Map<String, Jump> jumpMap;

    public UserInterface(Scanner scan) {
        this.scan = new Scanner(System.in);
        Map<String, Jump> jumpMap= new HashMap<String, Jump>();
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

        System.out.println("The tournament begins!\n");
        System.out.println("Write \"jump\" to jump; otherwise you quit: ");



        while (true) {
            String cmd = scan.nextLine();

            if (cmd.equals("")) {   // if they press Enter, then quit
                return;
            }


        }






    }
}
