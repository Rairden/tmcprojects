public class NumberStatistics {
    /**
     * Implement class NumberStatistics with the following methods:
     *
     * addNumber adds a new number to the statistics
     * amountOfNumbers tells us how many numbers have been added to the
     * statistics
     * Note that the class should not store the added numbers. At this stage,
     * it is enough to remember how many added numbers there are, i.e. how
     * many times the method addNumber has been called.
     *
     * Amount: 4        // for calling sout obj.amountOfNumbers()
     */

    private int number;
    private int amtOfNumbers;

    public NumberStatistics() {
        this.amtOfNumbers = 0;
    }

    public void addNumber(int num) {
        number += num;
        amtOfNumbers++;
    }

    public int amountOfNumbers() {
        return amtOfNumbers;
    }

    public int sum() {
        return number;
    }

    public double average() {
        while (amtOfNumbers == 0) {
            return 0;
        }
        return (double) number/amtOfNumbers;
    }
}
