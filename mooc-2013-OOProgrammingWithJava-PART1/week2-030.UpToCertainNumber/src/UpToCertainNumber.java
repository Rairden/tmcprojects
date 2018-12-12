
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number?");

        int number = reader.nextInt();


        for (int i = 1; i < number+1; i++) {
            System.out.println(i);

        }

    }
}
/*
    Up to what number? 5
        1
        2
        3
        4
        5
Create a program that prints all whole numbers from 1 to the number the user enters.
*/



