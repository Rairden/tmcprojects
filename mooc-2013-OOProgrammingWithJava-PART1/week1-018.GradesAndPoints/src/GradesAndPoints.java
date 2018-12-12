
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Type the points [0-60]: ");
        int a = Integer.parseInt(reader.next());

        if (a < 30 && a >= 0)
            System.out.println("You failed");
            else if (a < 35)
                System.out.println("1");
            else if (a < 40)
                System.out.println("2");
            else if (a < 45)
                System.out.println("3");
            else if (a < 50)
                System.out.println("4");
            else if (a >= 50 && a <= 60)
                System.out.println("5");
            else System.out.println("input proper grade");

        }
}

//    Points	Grade
//        0–29	failed
//        30–34	1
//        35–39	2
//        40–44	3
//        45–49	4
//        50–60	5
