import java.util.ArrayList;

public class StringUtils {

    /** checks if the string searched is contained within the string word (title()).
     * "PENGUIN  " should return TRUE, if the word/title is "penguin"
     *
     * @param word the book title or publisher
     * @param searched the search term
     * @return TRUE if it contains a substring (ignoring whitespaces)
     */

    public static boolean included(String word, String searched) {
        if (word == null || searched == null) {
            return false;
        }
        String x = word.toLowerCase();
        String y = searched.toLowerCase().trim();
        // turn searched from " TEST " to "test"

        return x.contains(y);
    }
}