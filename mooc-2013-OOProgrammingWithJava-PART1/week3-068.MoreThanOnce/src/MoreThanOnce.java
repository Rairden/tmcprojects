import java.util.ArrayList;
import java.util.Scanner;

public class MoreThanOnce {
    /**
     * Create the method moreThanOnce that gets a list of integers and an integer (i.e. number) as parameter.
     * If the number appears on the list more than once the method returns true and otherwise false.
     *
     * Type a number: 2
     * 2 appears more than once
     *
     * Type a number: 3
     * 3 does not appear more than once.
     */

    /**
     * @param list
     * @param searched
     * @return
     */
    public static boolean moreThanOnce(ArrayList<Integer> list, int searched) {
        boolean found = false;

        if (list.size() == 1)
            return false;

        for (int x : list) {
            if (searched == x)
                found = true;
            else
                found = false;
        }
        return found;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once. ");
        }
    }
}
