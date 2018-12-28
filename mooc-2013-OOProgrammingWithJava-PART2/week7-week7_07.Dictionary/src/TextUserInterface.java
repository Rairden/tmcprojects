import java.util.Scanner;

public class TextUserInterface {

    private Scanner scan;
    private Dictionary dict;

    public TextUserInterface(Scanner scan, Dictionary dictionary) {
        this.scan = scan;
        this.dict = dictionary;
    }

    public void start() {
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface\n");

        while (true) {
            System.out.print("Statement: ");
            String command = scan.nextLine();

            switch (command) {
                case "quit":
                    System.out.println("Cheers!");
                    return;
                case "add":
                    System.out.print("In Finnish: ");
                    String key = scan.nextLine();
                    System.out.print("Translation: ");
                    String value = scan.nextLine();
                    dict.add(key, value);
                    System.out.println();
                    break;
                case "translate":
                    System.out.print("Give a word: ");
                    String key2 = scan.nextLine();
                    System.out.print("Translation: ");
                    System.out.println(dict.getHashMap().get(key2));
                    System.out.println();
                    break;
                default:
                    System.out.println("Unknown statement\n");
                    break;
            }
        }
    }


}