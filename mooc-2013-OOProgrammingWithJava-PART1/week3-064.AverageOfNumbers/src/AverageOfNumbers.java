
import java.util.ArrayList;

public class AverageOfNumbers {

    /**
     * Create the method average, which receives a list of numbers (ArrayList<Integer>) as a parameter and then
     * calculates the average of the items in that list.
     *
     * Note: the method should use the method sum from the previous exercise to calculate the sum of the parameters.
     */

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int x : list) {
            sum = sum + x;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double avg = (double)sum(list)/list.size();
        return avg;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
