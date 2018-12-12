
import java.util.Scanner;


public class Divider {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        double a = reader.nextInt();

        System.out.println("Type another number: ");
        double b = reader.nextInt();
        double quotient = a / b;
        System.out.println("Division: " + a +" / "+ b + " = " + quotient);




    }
}

// lib/nhllib.jar/nhlstats/


//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//
//        // Implement your program here. Remember to ask the input from user.
//        System.out.println("Type a number: ");
//        double number1 = Integer.parseInt(reader.nextLine());
//        System.out.println("Type another number: ");
//        double number2 = Integer.parseInt(reader.nextLine());
//        double div = number1 / number2;
//        System.out.println("Division: " + number1 +" / "+ number2 + " = " + div);
//    }
