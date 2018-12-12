import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {
    /**
     * Create the method smartCombine that works like the previous combine method except that numbers
     * can be on the list only once. This means that the method adds a new number to the list only if the list
     * does not already contain that number. You might find the method contains from the ArrayList class useful.
     * You can use that method to check if a number is in the list.
     */

    /**
     * Adds two lists together if there are no duplicates
     * @param first the first list
     * @param second the second list
     */

    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
        for (int x : second) {
            if (first.contains(x)) {
                // do nothing
            } else {
                first.add(x);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);
        Collections.addAll(list2, 5, 10, 4, 3, 7);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

}
