public class BoundedCounter {
    /**
     * Implement class BoundedCounter with the following functionality:
     * A counter has an object variable that remembers the value of the counter. The value is within the range 0...
     * ..upperBound
     * In the beginning the value is 0.
     * The upper bound of the value is defined by the constructor parameter.
     * The method next increments the value of the counter. If the value would be more that the upper limit, it wraps
     * around and becomes zero.
     * The method toString returns a string representation of the counter value.
     */

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        if (value <= upperLimit) {
            value++;
        }
        if (value > upperLimit) {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int x) {
        if (x >= 0 && x <= upperLimit) {
            this.value = x;
        }
    }

    public String toString() {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }
}
