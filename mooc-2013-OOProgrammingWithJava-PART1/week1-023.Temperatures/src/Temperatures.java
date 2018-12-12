import java.util.Scanner;



public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.

//Improve your program so that temperatures
// below -30 degrees or over +40 degrees are ignored and not added to the graph.
        while (true) {
            double number = Double.parseDouble(reader.nextLine());
            if (number >= -30 && number <= 40) {
                Graph.addNumber(number);
            }
        }


    }
}

//Create a program that asks the user to input floating point numbers (double)
// and then adds the numbers to the graph. Use the while-true structure again.
// Note: To read a double, use: double number = Double.parseDouble(reader.nextLine());