import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password

        String bank = "abcdefghijklmnopqrstuvwxyz";
        String str = "";

        if (length > 0) {

            int i = 0;
            while (i < length) {
                char randomChar = bank.charAt(random.nextInt(bank.length()));
                str = str + randomChar;
                i++;
            }
            return str;     // returns a random String ("0pLyX4Louki0S")
        }
        return "";
    }

}
