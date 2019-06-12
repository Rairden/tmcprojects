import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        File f = new File(file);
        Scanner scan = new Scanner(f);
        List<String> list = new ArrayList<>();

        while (scan.hasNextLine()) {
            list.add(scan.nextLine());
        }
        return list;
    }

    public void save(String file, String text) throws IOException {
        File f = new File(file);
        FileWriter writer = new FileWriter(f);
        writer.write(text);
        writer.close();
    }

    /**
     * copies the contents from one file and overwrites another
     * @param file the file to be copied to
     * @param texts the file to be copied from
     * @throws IOException
     */
    public void save(String file, List<String> texts) throws IOException {
        File f = new File(file);
        FileWriter writer = new FileWriter(f);

        for (String text : texts) {
            writer.write(text);
            writer.write(10);   // writer.write(System.getProperty("line.separator"));
        }
        writer.close();
    }
}
