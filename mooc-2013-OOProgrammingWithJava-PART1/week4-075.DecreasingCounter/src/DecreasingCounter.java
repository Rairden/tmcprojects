public class DecreasingCounter {
    /**
     * The constructor of DecreasingCounter receives as parameter the initial value of the counter.
     * In the example, the constructor parameter is 10, which is then set to the object variable this.value.
     * The value of the counter can be printed with the method printValue(). The method decrease() should decrease
     * the value of the counter by one.
     * <p>
     * Implement the method decrease() so that when called, the object variable this.value is decreased by one.
     */

    private int value;  // instance variable that remembers the value of the counter
    private int initValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initValue = valueAtStart;
    }

    public void printValue() {  // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {  // write here code to decrease counter value by one
        if (value > 0) {
            value--;
        }
    }

    // and here the rest of the methods

    public void increase() {  // write here code to decrease counter value by one
        value++;
    }

    public void reset() {  // sets the value to 0.
        value = 0;
    }

    public void setInitial() {  // sets the value back to original value
        value = initValue;
    }

}
