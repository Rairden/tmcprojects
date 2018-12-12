
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number:");

        int number = reader.nextInt();
        int result = 0;

        for (int i = 0; i <= number; i++) {

            result += Math.pow(2, i);

        }
        System.out.println("The result is " + result);

    }
}
