
import java.util.Scanner;

public class Main {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
    // Your program should use only one Scanner object, i.e., it is allowed to call
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

    public static void main(String[] args) {

        String key = "";

        BirdDB db = new BirdDB();

        while (key != "quit") {
            Scanner scan = new Scanner(System.in);

            System.out.println("?\n");
            key = scan.nextLine();

            switch (key) {
                case "add":
                    db.add(scan);
                    break;
                case "obs":
                    db.observation(scan);
                    break;
                case "stats":
                    db.statistics();
                    break;
                case "show":
                    db.show();
                    break;
                case "quit":
                    key = "quit";
                    break;
            }



        }


    }
}
