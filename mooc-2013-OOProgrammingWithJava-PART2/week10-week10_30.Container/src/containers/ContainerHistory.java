package containers;

import java.util.ArrayList;

public class ContainerHistory {

    private ArrayList<Double> container;

    public ContainerHistory() {
        this.container = new ArrayList<Double>();
    }

    public void reset() {
        container.clear();
    }

    /**
     * adds the parameter situation to the end of the container history.
     * @param situation
     */
    public void add(double situation) {
        container.add(situation);
    }

    /**
     * If the history is empty, the method returns 0.
     * @return the greatest value in the container history.
     */
    public double maxValue() {
        if (container.isEmpty()) {
            return 0;
        }

        double max = container.get(0);
        for (Double d : container) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    /**
     * If the history is empty, the method returns 0.
     * @return the smallest value in the container history.
     */
    public double minValue() {
        if (container.isEmpty()) {
            return 0;
        }

        double min = container.get(0);
        for (Double d : container) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    /**
     * @return the absolute value of the single greatest fluctuation in the container history
     */
    public double greatestFluctuation() {
        if (container.isEmpty() || container.size() == 1) {
            return 0;
        }
        double greatestFluc = 0;
        double difference = 0;

        for (int i = 0; i < container.size(); i++) {
            if (i == 0) {
                continue;
            }
            difference = container.get(i) - container.get(i-1);
            Math.abs(difference);

            if (difference > greatestFluc) {
                greatestFluc = difference;
            }

        }
        return greatestFluc;
    }

    /**
     * If the history is empty, the method returns 0.
     * @return the average of the values in the container history.
     */
    public double average() {
        return average(container);
    }

    public double variance() {
        return variance(container);
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (double x : list) {
            sum = sum + x;
        }
        return sum;
    }

    /**
     * @param list the list to be averaged
     * @return the average
     */
    public static double average(ArrayList<Double> list) {
        double avg = (double) sum(list)/list.size();
        return avg;
    }

    /**
     * A variance formula.
     * @param list the integers input list
     * @return the calculated variance
     */
    public static double variance(ArrayList<Double> list) {
        ArrayList<Double> diffList = new ArrayList<Double>();

        double avg = average(list);
        double diffOfSquares = 0;
        double variance = 0;

        for (double x : list) {
            double difference = x - avg;
            diffList.add(difference);
        }
        for (double x : diffList) {
            diffOfSquares += Math.pow(x, 2);
        }
        variance = diffOfSquares/(list.size()-1);
        return variance;
    }

    @Override
    public String toString() {
        return "ContainerHistory{" +
                "container=" + container +
                '}';
    }

}
