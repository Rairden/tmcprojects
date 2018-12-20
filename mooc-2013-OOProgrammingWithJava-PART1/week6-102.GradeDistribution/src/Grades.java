import java.util.ArrayList;
import java.util.Scanner;

public class Grades {

    public ArrayList<Integer> scores = new ArrayList<>();

    private int zero;
    private int one;
    private int two;
    private int three;
    private int four;
    private int five;

    public ArrayList<Integer> addScores(Scanner scan) {
        while (true) {
            int next = scan.nextInt();
            if (next == -1) {
                break;
            }
            scores.add(next);
        }
        return scores;
    }

    public void printStars(int cnt) {
        while (cnt >= 1) {
            System.out.print("*");
            cnt--;
        }
        System.out.println();
    }

    public double acceptancePercentage(Grades scores) {
        double allGrades =
                scores.getZero() + scores.getOne() + scores.getTwo() +
                scores.getThree() + scores.getFour() + scores.getFive();

        return 100 * ((allGrades - scores.getZero()) / allGrades);
    }

    public ArrayList<Integer> calcGrades(ArrayList<Integer> scores) {
        for (int x = 0; x < scores.size(); x++) {
            if (scores.get(x) >= 0 && scores.get(x) <= 29) {
                this.zero++;
            } else if (scores.get(x) <= 34) {       // Points  Grade
                this.one++;                         // 0–29	   failed
            } else if (scores.get(x) <= 39) {       // 30–34   1
                this.two++;                         // 35–39   2
            } else if (scores.get(x) <= 44) {       // 40–44   3
                this.three++;                       // 45–49   4
            } else if (scores.get(x) <= 49) {       // 50–60   5
                this.four++;
            } else if (scores.get(x) >= 50 && scores.get(x) <= 60) {
                this.five++;
            } else { /* bogus grade */ }
        }
        return scores;
    }

    public int getZero() {
        return zero;
    }

    public int getOne() {
        return one;
    }

    public int getTwo() {
        return two;
    }

    public int getThree() {
        return three;
    }

    public int getFour() {
        return four;
    }

    public int getFive() {
        return five;
    }
}