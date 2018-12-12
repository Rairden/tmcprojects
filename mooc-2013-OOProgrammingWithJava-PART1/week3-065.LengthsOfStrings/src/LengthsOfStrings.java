import java.util.ArrayList;

public class LengthsOfStrings {

    /**
     * Create the method lengths that gets a list of String variables as a parameter and returns an ArrayList
     * that contains the lengths of the Strings in the same order as the original list.
     *
     * The lengths of the Strings: [5, 3, 10, 27]
     */

    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        // write code here
        for (String str : list) {
            int length = str.length();
            lengthList.add(length);
        }
        return lengthList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ciao");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
        
        System.out.println("The lengths of the Strings: " + lengths);
    }
}
