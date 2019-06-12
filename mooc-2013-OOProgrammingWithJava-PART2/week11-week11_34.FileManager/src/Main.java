import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();

        for (String line : t.read("src/testinput2.txt")) {
            System.out.println(line);
        }

        // careful, this will overwrite testinput2.txt
        t.save("src/testinput2.txt", t.read("src/testinput1.txt"));
    }
}
