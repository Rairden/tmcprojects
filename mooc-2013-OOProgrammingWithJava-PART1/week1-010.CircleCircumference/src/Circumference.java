
import java.util.Scanner;

import static java.lang.Math.PI;


public class Circumference {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: ");

        int radius = reader.nextInt();
        double circumference = 2*PI*radius;

        System.out.println("Circumference of the circle: " + circumference);

    }
}
