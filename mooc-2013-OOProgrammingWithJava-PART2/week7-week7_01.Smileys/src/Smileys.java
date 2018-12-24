
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");

    }

    private static void printWithSmileys(String characterString) {
        String smiley = ":)";

        if (characterString.length() % 2 == 1) {
            characterString += " ";
        }

        String output = smiley + " " + characterString + " " + smiley;

        for (int i = 0; i < output.length()/2; i++) {
            System.out.print(smiley);
        }

        System.out.println();
        System.out.print(output);
        System.out.println();

        for (int i = 0; i < output.length()/2; i++) {
            System.out.print(smiley);
        }
        System.out.println();
    }

}
