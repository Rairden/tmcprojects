import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");

        int number  = 0;
        int sum     = 0;
        int i       = 0;
        int cnt     = 0;
        double avg  = 0;
        int even    = 0;
        int odd     = 0;
        int a = 0;
            a = 1;

        while (i != -1) {
            i = reader.nextInt();

            if (i == -1) {
                break;
            } else {
                sum = sum + i;
                cnt++;

                avg = (double)sum/cnt;

                if (i % 2 == 0)
                    even++;
                else
                    odd++;
                }
            }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + cnt);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}

/**    Type numbers:
        5
        2
        4
        -1
        Thank you and see you later!
        The sum is 11
        How many numbers: 3
        Average: 3.666666666666
        Even numbers: 2
        Odd numbers: 1

*/
