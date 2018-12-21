import java.util.ArrayList;
import java.util.Scanner;

public class BirdDB {

    public ArrayList<Bird> birdList = new ArrayList<>();

    public void add(Scanner scan) {
        System.out.print("Name: ");
        String bird = scan.nextLine();

        System.out.print("Latin Name: ");
        String latinBird  = scan.nextLine();
        System.out.println();
        birdList.add(new Bird(bird, latinBird));
    }

    // asks what was observed?
    public void observation(Scanner scan) {
        System.out.print("What was observed?: ");
        String bird = scan.nextLine();
        System.out.println();

        for (Bird b : birdList) {
            if (b.birdName().equals(bird)) {
                b.incrementBird(b);
            }
        }
    }
                                    // Seagull (Dorkus Dorkus): 2 observations
    // prints all the birds         // Raven (Corvus Corvus): 0 observations
    public void statistics() {
        for (Bird b : birdList) {
            System.out.println(b);
        }
    }

    // same as stats; only 1 bird   // Raven (Corvus Corvus): 0 observations
    public void show() {

    }
    
}
