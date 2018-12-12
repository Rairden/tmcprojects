import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    /**
     * Your assignment is to expand the class LotteryNumbers, which draws the
     * lottery numbers of the week. The numbers of the week consist of 7
     * different numbers between 1 and 39. The class has the following
     * functionality:
     *
     * the constructor LotteryNumbers creates a new LotteryNumbers object,
     * which contains the new drawn numbers
     * the method numbers returns the drawn numbers of this draw
     * the method drawNumbers draws new numbers
     * the method containsNumber reveals if the number is among the drawn
     * numbers
     */

    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        this.numbers = new ArrayList<Integer>();
        int i = 1;
        while (i < 8) {
            int x = random.nextInt(39) + 1;
            if (!containsNumber(x)) {
                numbers.add(x);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return numbers.contains(number);
    }
}
