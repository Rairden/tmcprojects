import java.util.Scanner;

public class Calculator {

    private Reader reader;
    private int calculationsCount;

    public Calculator() {
        this.reader = new Reader();
    }

    public void start() {
        while(true) {
        System.out.print("command: ");
        String command = reader.readString();
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

    private void sum() {
        System.out.println("value1:\n");
        int operand1 = reader.readInteger();
        System.out.println("value2:\n");
        int operand2 = reader.readInteger();

        System.out.println("sum of the values " + (operand1 + operand2));
        calculationsCount++;
    }

    private void difference() {
        System.out.println("value1:\n");
        int operand1 = reader.readInteger();
        System.out.println("value2:\n");
        int operand2 = reader.readInteger();

        System.out.println("difference of the values " + (operand1 - operand2));
        calculationsCount++;
    }

    private void product() {
        System.out.println("value1:\n");
        int operand1 = reader.readInteger();
        System.out.println("value2:\n");
        int operand2 = reader.readInteger();

        System.out.println("product of the values " + (operand1 * operand2));
        calculationsCount++;
    }

    private void statistics() {
        System.out.println("Calculations done " + calculationsCount);
    }
}