
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("First:");
        int lower = reader.nextInt();

        System.out.println("Last:");
        int upper = reader.nextInt();

        for (int i = lower; i <= upper && i >= lower; i++) {
            System.out.println(i);
        }


    }
}

//Create a program that asks the user for the first number
// and the last number and then prints all numbers between those two.

/*
        First: 5
        Last: 8
        5
        6
        7
        8
 */
