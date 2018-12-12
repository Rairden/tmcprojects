
public class Main {
    /**
     * Implement the class Multiplier that has:
     *
     * a constructor public Multiplier(int number).
     * a method public int multiply(int otherNumber) that returns otherNumber multiplied by number (i.e., the
     * constructor parameter).
     *
     * Output:
     * threeMultiplier.multiply(2): 6
     * fourMultiplier.multiply(2): 8
     * threeMultiplier.multiply(1): 3
     * fourMultiplier.multiply(1): 4
     */

    public static void main(String[] args) {
        // This is an empty main method which you can use to test your class's functionality.

        Multiplier threeMultiplier = new Multiplier(3);
        Multiplier fourMultiplier = new Multiplier(4);

        threeMultiplier.multiply(2);
        fourMultiplier.multiply(2);
    }
}
