import java.util.Random;

public class Dice {
    /**
     * The constructor Dice(int numberOfSides) creates a new dice object that
     * has the amount of sides defined by the argument.
     * The method roll tells the result of a roll (which depends on the
     * number of its sides)
     */

    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides;
    }

    public int roll() {
        // create here a random number belonging to range 1-numberOfSided
        if (numberOfSides > 0) {
            return random.nextInt(numberOfSides) +1;
        }
        return 0;
    }
}
