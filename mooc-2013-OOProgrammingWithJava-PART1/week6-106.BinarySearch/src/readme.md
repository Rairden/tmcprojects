The template you get from the test automaton has a start for an implementation of binary search.
The class `BinarySearch` holds a method `public static boolean search(int[] array,
int searchedValue)`, the job of which is to figure out, by using binary search, if the
value given as a parameter is in the sorted array that is also given as parameter.

The method `search` does not work yet, however. Finish the method's
implementation into a real binary search.

For testing, a separate main program can be found in the class `Main`, which has a
frame like this:

<pre class="sh_java sh_sourceCode">
import java.util.Arrays;import java.util.Scanner;public class Main {
    public static void main(String[] args) {
        // Here you can test binary search
        int[] array = { -3, 2, 3, 4, 7, 8, 12 };
        Scanner reader = new Scanner(System.in);

        System.out.print("Values of the array: " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));

        // Print the binary search result here
    }
}
</pre>

The execution of the program looks like this:

<pre>
Values of the array: [-3, 2, 3, 4, 7, 8, 12]

Enter searcher number: 

<font color="red">8</font>

Value 8 is in the array

</pre>

<pre>
Values of the array: [-3, 2, 3, 4, 7, 8, 12]

Enter searcher number: 

<font color="red">99</font>

Value 99 is not in the array
</pre>