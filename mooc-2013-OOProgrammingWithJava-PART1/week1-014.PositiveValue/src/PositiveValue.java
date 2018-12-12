
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");

        int input1 = Integer.parseInt(reader.nextLine());

        if (input1 > 0)
            System.out.println("The number is positive.");
        else
            System.out.println("The number is not positive.");
    }
}
