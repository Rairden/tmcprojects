import java.util.Scanner;

public class Main {

    public static void doSomething(Scanner scanner) {
        String riw = scanner.nextLine();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Grades tests = new Grades();


        System.out.println("Type exam scores, -1 completes:");
        tests.addScores(scanner);







    }
}
