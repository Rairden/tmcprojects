public class Multiplier {
    /**
     * a constructor public Multiplier(int number).
     * a method public int multiply(int otherNumber) that returns otherNumber multiplied by number (i.e., the
     * constructor parameter).
     */

    private int number;

    public Multiplier(int number) {
        this.number = number;
    }

    public int multiply(int otherNumber) {
        return otherNumber * number;
    }

}
