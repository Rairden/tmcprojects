package wordinspection;

public class Palindromi {

    public Palindromi() {
    }

    /**
     * @param text inputs a string
     * @return a string that has been reversed.
     */
    public static String reverse(String text) {
        String str = "";
        for (int i = text.length(); i > 0; i--) {
            str += text.charAt(i - 1);
        }
        return str;
    }

    /**
     * @param text a string to reverse
     * @return TRUE if the string is same forward/backwards
     */
    public static boolean palindrome(String text) {
        return text.equals(reverse(text));
    }

}
