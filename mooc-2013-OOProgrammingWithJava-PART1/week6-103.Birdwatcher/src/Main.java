
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String key = "";

        BirdDB db = new BirdDB();

        while (key != "Quit") {
            Scanner scan = new Scanner(System.in);

            System.out.print("? ");
            key = scan.nextLine();

            switch (key) {
                case "Add":
                    db.add(scan);
                    break;
                case "Observation":
                    db.observation(scan);
                    break;
                case "Statistics":
                    db.statistics();
                    break;
                case "Show":
                    db.show(scan);
                    break;
                case "Quit":
                    key = "Quit";
                    break;
            }

        }


    }
}
