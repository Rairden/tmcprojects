
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First:");
        int first = reader.nextInt();

        System.out.println("Last:");
        int last = reader.nextInt();

        int number = 0;
        int cnt = 0;




        while (first <= last) {
            number = number+last;
            last--;

        }
        System.out.println("Sum:" + number);
        
    }
}

//        First: 3
//        Last: 5
//        The sum 12


//Similar to the previous exercise, except that the program should ask for both the lower and upper bound.
// You can assume that the users first gives the smaller number and then the greater number.