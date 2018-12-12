import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {
    /**
     * Create a program that asks the user to input words until the user gives the same word twice.
     * Use an ArrayList structure in your program. ArrayList is defined like this:
     * Type a word: carrot
     * Type a word: celery
     * Type a word: turnip
     * Type a word: celery
     * You gave the word celery twice
     */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> words = new ArrayList<String>();

        String str="hello";

        while(!str.equals("")){
            System.out.print("Type a word: ");
            str = reader.nextLine();

            if(words.contains(str)){
                break;
            } else {
                words.add(str);
            }

        }

        System.out.println("You gave the word " + str + " twice");

    }
}