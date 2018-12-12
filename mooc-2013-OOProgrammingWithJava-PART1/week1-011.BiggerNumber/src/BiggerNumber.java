
import java.util.Scanner;
import static java.lang.Math.*;

//import static java.lang.Math.PI;



public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number:");
        int c = Integer.parseInt(reader.nextLine());


        System.out.println("Type another number:");
        int d = Integer.parseInt(reader.nextLine());


        if (c < d) {
            System.out.println("The bigger number of the two numbers given was: " + d);

        } else {
            System.out.println("The bigger number of the two numbers given was: " + c);
        }


    }

}



