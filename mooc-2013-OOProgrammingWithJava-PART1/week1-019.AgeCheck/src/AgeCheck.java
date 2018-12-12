
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?");
        int input1 = reader.nextInt();

        if (input1 >= 0 && input1 <= 120)
            System.out.println("OK");
        else
            System.out.println("Impossible!");
    }
}
