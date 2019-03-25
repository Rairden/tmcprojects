import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Printer {

    private File file;

    public Printer(String filename) throws Exception {
        file = new File(filename);
    }

    public void printLinesWhichContain(String word) throws Exception {

        Scanner reader = new Scanner(file, StandardCharsets.UTF_8);

        while (reader.hasNextLine()) {
            String line = reader.nextLine();

            if (line.contains(word)) {
                System.out.println(line);
            }
        }
    }
}
