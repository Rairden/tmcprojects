package dictionary;

public class Main {

    public static void main(String[] args) {

        MindfulDictionary dict = new MindfulDictionary();
        dict.add("apina", "monkey");
        dict.add("banaani", "banana");
        dict.add("apina", "apfe");

        System.out.println(dict.translate("apina"));
        System.out.println(dict.translate("monkey"));
        System.out.println(dict.translate("programming"));
        System.out.println(dict.translate("banana"));

        printLine();    // ------------------

        MindfulDictionary dict2 = new MindfulDictionary();
        dict2.add("apina", "monkey");
        dict2.add("banaani", "banana");
        dict2.add("ohjelmointi", "programming");
        dict2.remove("apina");
        dict2.remove("banana");

        System.out.println(dict2.translate("apina"));
        System.out.println(dict2.translate("monkey"));
        System.out.println(dict2.translate("banana"));
        System.out.println(dict2.translate("banaani"));
        System.out.println(dict2.translate("ohjelmointi"));

        printLine();    // ------------------

        MindfulDictionary dict3 = new MindfulDictionary("src/words.txt");
        dict3.load();

        System.out.println(dict3.translate("apina"));
        System.out.println(dict3.translate("ohjelmointi"));
        System.out.println(dict3.translate("alla oleva"));

        printLine();    // ------------------

        MindfulDictionary dict4 = new MindfulDictionary("src/words.txt");
        dict4.load();

        dict4.add("erik", "Rairden");
        dict4.add("red", "blue");
        dict4.add("zero", "one");

        dict4.save();
    }

    private static void printLine() {
        System.out.println("--------------------------------------------");
    }
}
