package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {

    private File file;

    public Analysis(File file) {
        this.file = file;
    }

    /**
     * @return lineFeeds - the number of lines in the file from parameterized constructor
     */
    public int lines() throws Exception {

        Scanner reader = new Scanner(file);
        int lineFeeds = 0;

        while (reader.hasNextLine()) {
            lineFeeds++;
            reader.nextLine();
        }
        return lineFeeds;
    }

    /**
     * @return totalChars - the number of characters in the file from parameterized constructor
     */
    public int characters() throws Exception {

        Scanner reader    = new Scanner(file);
        int numberOfChars = 0;

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            numberOfChars += line.length();
        }

        int totalChars = numberOfChars + lines();
        return totalChars;
    }
}
