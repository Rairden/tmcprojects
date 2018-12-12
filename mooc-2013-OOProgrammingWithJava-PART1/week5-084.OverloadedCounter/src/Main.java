// https://materiaalit.github.io/2013-oo-programming/part1/week-5/
public class Main {
    /**
     * Make a class Counter that holds a number that can be decreased and
     * increased. The counter also has an optional check that prevents the
     * counter from going below 0. The class has to have the following
     * constructors:
     *
     * public Counter(int startingValue, boolean check) creates a new counter
     * with the given value. The check is on if the parameter given to check
     * was true.
     *
     * public Counter(int startingValue) creates a new counter with the given
     * value. The check on the new counter should be off.
     *
     * public Counter(boolean check) creates a new counter with the starting
     * value 0.
     * The check is on if the parameter given to check was true.
     *
     * public Counter() creates a new counter with the starting value of 0
     * and with checking off.
     */

    public static void main(String[] args) {

        Counter c = new Counter(2, true);
        c.decrease(4);
        System.out.println(c.value());
    }
}
