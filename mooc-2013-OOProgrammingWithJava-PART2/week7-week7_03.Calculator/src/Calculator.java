import java.util.Scanner;

public class Calculator {

    public Scanner scan;

    public void start() {while(true) {
        System.out.print("command: ");
        String command = scan.readString();
        if (command.equals("end")) {
            break;
        }

        if (command.equals("sum")) {
            sum();
        } else if (command.equals("difference")) {
            difference();
        } else if (command.equals("product")) {
            product();
        }
    }

        statistics();
    }

    public void sum() {

    }

    public void difference() {

    }

    public void product() {

    }

    private void statistics() {

    }
}
