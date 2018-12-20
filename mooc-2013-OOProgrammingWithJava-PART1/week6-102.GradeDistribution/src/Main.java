import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Grades tests = new Grades();

        System.out.println("Type exam scores, -1 completes:");
        tests.addScores(scanner);

        tests.calcGrades(tests.scores);

        System.out.println("Grade distributions:");
        System.out.print("5: ");
        tests.printStars(tests.getFive());
        System.out.print("4: ");
        tests.printStars(tests.getFour());
        System.out.print("3: ");
        tests.printStars(tests.getThree());
        System.out.print("2: ");
        tests.printStars(tests.getTwo());
        System.out.print("1: ");
        tests.printStars(tests.getOne());
        System.out.print("0: ");
        tests.printStars(tests.getZero());

        System.out.print("Acceptance percentage: ");
        System.out.println(tests.acceptancePercentage(tests));

    }
}

/*
        Grade distributions:
        5: ***
        4:
        3: *
        2: **
        1: *
        0: *
        Acceptance percentage: 87.5
*/
