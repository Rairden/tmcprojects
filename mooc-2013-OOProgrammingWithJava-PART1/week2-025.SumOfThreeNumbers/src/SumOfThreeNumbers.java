
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read from user in this variable


        // Write your program here
        // Use only variables sum and read

        System.out.println("Type the first number:");
        read = reader.nextInt();
        sum += read;
        System.out.println("Type the second number:");
        read = reader.nextInt();
        sum += read;

        System.out.println("Type the third number:");
        read = reader.nextInt();
        sum += read;

        System.out.println("Sum: " + sum);
    }
}

/**
    Type the first number: 3
    Type the second number: 6
    Type the third number: 12

    Sum: 21
*/