public class Counter {

    public int counter;
    private boolean check;

    public Counter() {
        this.counter = 0;
        this.check = false;
    }

    public Counter(boolean check) {
        this.counter = 0;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.counter = startingValue;
        this.check = false;
    }

    public Counter(int startingValue, boolean check) {
        this.counter = startingValue;
        this.check = check;
    }

    public int value() {
        return counter;
    }

    public void increase() {
        counter++;
    }

    public void decrease() {
        if (check) {
            if (counter >= 1) {
                counter--;
            }
        } else counter--;
    }

    public void decrease(int decreaseAmount) {
        if (check) {
            if (counter < 1) {/*do nothing*/} else {
                counter -= decreaseAmount;
                if (counter < 0) {
                    counter = 0;
                }
            }
        }
        else if (decreaseAmount < 0) {/* do nothing*/} else
            counter -= decreaseAmount;
    }
}