import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));
        printLine();    // -------------------------------------

        Dictionary dictionary2 = new Dictionary();
        dictionary2.add("apina", "monkey");
        dictionary2.add("banaani", "banana");
        System.out.println(dictionary2.amountOfWords());

        dictionary2.add("cembalo", "harpsichord");
        System.out.println(dictionary2.amountOfWords());
        printLine();    // -------------------------------------

        ArrayList<String> translations = dictionary.translationList();
        for(String x : translations) {
            System.out.println(x);
        }
        printLine();    // -------------------------------------

        Scanner scan    = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(scan, dict);

        ui.start();


    }

    public enum cmd {
        quit, add, translate;
    }

    static void printLine() {
        System.out.println("--------------------------------------------------");
    }
}