import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Type a number:");
        Scanner reader = new Scanner(System.in);
        int stop = reader.nextInt();
        int number = 1;

        if (stop == 0) {
            System.out.println("Factorial is: " + 1);
        } else {

            while (stop > 0) {
                number = number*stop;
                stop--;

            }
            System.out.println("Factorial is: " + number);
        }
    }

}


//Create a program that calculates the factorial of the number n.