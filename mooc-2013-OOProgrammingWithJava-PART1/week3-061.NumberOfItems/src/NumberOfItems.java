import java.util.ArrayList;

public class NumberOfItems {
    /*
     * Create the method public static int countItems(ArrayList<String> list) that
     * returns the number of the items in the list. Your method should not print anything.
     * Use a return statement to return the number as shown in the following example:
     *
     * There are this many items in the list:
     * 3
     */

    // implement here the method countItems
    /**
     * @param str an ArrayList
     * @return cnt Returns the number of items in the list
     */
    public static int countItems(ArrayList<String> str) {
        int cnt = 0;
        for (String x : str) {
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Moi");
        list.add("Ciao");
        list.add("Hello");
        System.out.print("There are this many items on the list: " + countItems(list));
    }
}
