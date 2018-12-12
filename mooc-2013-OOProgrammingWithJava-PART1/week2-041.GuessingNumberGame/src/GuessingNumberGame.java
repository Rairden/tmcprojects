
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!

        int usernum = 0;
        int cnt = 0;

        while(true) {
            System.out.println("Guess a number: ");
            usernum = reader.nextInt();

                if (usernum == numberDrawn) {
                    System.out.println("Congratulations, your guess is correct!");
                    break;
                } else if (numberDrawn < usernum) {
                    System.out.println("The number is lesser, " + "guesses made: " + cnt);
                    cnt++;
                } else {
                    System.out.println("The number is greater, " + "guesses made: " + cnt);
                    cnt++;
                }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}

/*

    Guess a number: 73
        The number is lesser, guesses made: 1
        Guess a number: 22
        The number is greater, guesses made: 2
        Guess a number: 51
        The number is greater, guesses made: 3
        Guess a number: 62
        The number is greater, guesses made: 4
        Guess a number: 68
        The number is greater, guesses made: 5
        Guess a number: 71
        The number is lesser, guesses made: 6
        Guess a number: 70
        Congratulations, your guess is correct!

*/
