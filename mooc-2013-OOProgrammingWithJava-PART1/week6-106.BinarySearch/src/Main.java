import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] arr = {-3, 2, 3, 4, 7, 8, 12};
        Scanner scan = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(arr));
        System.out.println();

        System.out.print("Enter searched number: ");
        String searchedValue = scan.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(arr, Integer.parseInt(searchedValue));

        // Print here the result
        if (result) {
            System.out.println("Value " + searchedValue + " is in the array");
        } else {
            System.out.println("Value " + searchedValue + " is not in the array");
        }
    }
}
