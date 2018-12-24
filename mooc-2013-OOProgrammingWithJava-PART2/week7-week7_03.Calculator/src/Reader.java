import java.util.Scanner;

public class Reader {

    private Scanner scan;

    public Reader() {
        this.scan = new Scanner(System.in);
    }

    public String readString() {
        return scan.nextLine();
    }

    public int readInteger() {
        return Integer.parseInt(scan.nextLine());
    }

}