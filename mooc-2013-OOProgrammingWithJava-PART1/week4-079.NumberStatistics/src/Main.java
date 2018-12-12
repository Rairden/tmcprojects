import java.util.Scanner;

public class Main {
    /**
     * Exercise 79.3: Asking for numbers from the user
     * Create a program that asks the user to input numbers of type integer.
     * When the user gives -1, the program stops and prints the sum of the
     * given numbers (excluding the -1).
     * Note: you should not make any changes to class NumberStatistics!
     *
     * Type numbers:        Type numbers:
     * 4                    4
     * 2                    2
     * -1                   5
     * sum: 6               2
     *                      -1
     *                      sum: 13
     *                      sum of even: 8
     *                      sum of odd: 5
     */
    public static void main(String[] args) {

        // Remember to remove all the extra code when doing assignments 79.3 and 79.4
        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");

        NumberStatistics stat1 = new NumberStatistics();
        NumberStatistics stat2 = new NumberStatistics();
        NumberStatistics stat3 = new NumberStatistics();

        while (reader.hasNextInt()) {
            int nextInt = reader.nextInt();
            if (nextInt == -1) {
                break;
            }

            if (nextInt % 2 == 0) {
                stat2.addNumber(nextInt);
            } else {
                stat3.addNumber(nextInt);
            }
            stat1.addNumber(nextInt);
        }
        System.out.println("sum: " + stat1.sum());
        System.out.println("sum of even: " + stat2.sum());
        System.out.println("sum of odd: " + stat3.sum());

/*        // part 1
        NumberStatistics stats = new NumberStatistics();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());*/
    }
}
