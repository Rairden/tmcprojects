
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        String input = "In the beginning there were the swamp, the hoe and Java.";
        System.out.println(input);
    }

    public static void main(String[] args) {
        // ask the user how many times the text should be printed
        // use the while structure to call the printText method several times
        Scanner reader = new Scanner(System.in);
        System.out.println("How many?");
        int howMany = reader.nextInt();

        while (howMany != 0) {
            printText();
            howMany--;
        }
    }
}