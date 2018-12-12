
import java.util.ArrayList;
import java.util.Collections;

public class CombiningArrayLists {

    /**
     * Create the method public static void combine(ArrayList<Integer> first, ArrayList<Integer> second)
     * that inserts the items in a list called second to a list called first. The order of the items
     * can be anything and the same item can appear in the list more than once.
     *
     */

    /**
     * @param first the first list
     * @param second the second list to be added to first
     */
    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        first.addAll(second);
    }

    public static void main(String[] args) {

        // You can change the values while testing
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);
        // A shorthand for:
        // list1.add(4);
        // list1.add(3);


        Collections.addAll(list2, 5, 10, 7);
        // A shorthand for:
        // list2.add(5);
        // list2.add(10);
        // list2.add(7);

        // Implement the following method and then remove the comment
        combine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);

    }

}
