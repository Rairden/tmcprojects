
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");

        int stop = reader.nextInt();
        int number = 0;
        int cnt = 0;

        while (stop > 0) {
            number = number+stop;
            stop--;
          //  cnt++;
        }

        System.out.println("Sum is " + number);
      //  System.out.println("Cnt: " + cnt);

    }
}


/*    Create a program that calculates the sum 1+2+3+…+n where n is a number entered by the user.

        Example outputs:

        Until what? 3
        Sum is 6
*/


// Hint: Create the program using the while statement. Use a helper variable in your program to
// remember how many times the block has been executed. Use also another helper variable
// to store the sum. During each execution add the value of the helper variable
// that counts the executions to the variable in which you should collect the sum.