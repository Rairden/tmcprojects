import java.util.ArrayList;

public class Variance {
    /**
     * Create the method variance, which receives a list of integers as a parameter and then returns the sample
     * variance of that list. You can check how a sample variance is calculated in Wikipedia, under "Population
     * variance and sample variance".
     *
     * Note: the method should use the method average of exercise 64 to calculate the average of the parameters. The
     * method should be called only once!
     *
     * The variance is: 5.666667
     */

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int x : list) {
            sum = sum + x;
        }
        return sum;
    }
    /**
     * @param list the list to be averaged
     * @return the average
     */
    public static double average(ArrayList<Integer> list) {
        double avg = (double) sum(list)/list.size();
        return avg;
    }
    /**
     * A variance formula.
     * @param list the integers input list
     * @return the calculated variance
     */
    public static double variance(ArrayList<Integer> list) {
        // write code here
        ArrayList<Double> diffList = new ArrayList<Double>();

        double avg = average(list);
        double diffOfSquares = 0;
        double variance = 0;

        for (int x : list) {
            double difference = x - avg;
            diffList.add(difference);
        }
        for (double x : diffList) {
            diffOfSquares += Math.pow(x, 2);
        }
        variance = diffOfSquares/(list.size()-1);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("The variance is: " + variance(list));
    }
}
