import java.util.ArrayList;
import java.util.Scanner;

public class Grades {

    ArrayList<Integer> scores = new ArrayList<>();

    private int grades;

    public ArrayList<Integer> addScores(Scanner scan) {
        ArrayList<Integer> scores = new ArrayList<>();

        while (scan.hasNextInt()) {
            if (scan.nextInt() == -1) {
                break;
            }
            scores.add(scan.nextInt());
        }
        return scores;
    }

    public ArrayList<Integer> calcGrades(Scanner scan) {
        ArrayList<Integer> scores = new ArrayList<>();
        int a = scan.nextInt();

        if (a >= 0 && a <= 29) {
            scores.add(scan.nextInt());
        } else if (a <= 34) {

        } else if (a <= 39) {

        } else if (a <= 44) {

        } else if (a <= 49) {

        } else if (a >= 50 && a <= 60) {

        } else {
            System.out.println("input proper grade");
        }

        return scores;
    }

//    Points	Grade
//        0–29	failed
//        30–34	1
//        35–39	2
//        40–44	3
//        45–49	4
//        50–60	5


}
