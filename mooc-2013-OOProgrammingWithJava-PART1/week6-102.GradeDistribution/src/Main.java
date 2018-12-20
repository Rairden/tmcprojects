import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Grades tests = new Grades();

        System.out.println("Type exam scores, -1 completes:");
        tests.addScores(scanner);

        tests.calcGrades(tests.scores);


        for (int i = 0; i < tests.scores.size(); i++) {
            System.out.println(tests.scores.get(i));
        }



    }
}
