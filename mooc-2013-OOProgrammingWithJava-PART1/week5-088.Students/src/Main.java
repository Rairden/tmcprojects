
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
     * name: Alan Turing
     * studentnumber: 017635727
     * name: Linus Torvalds
     * studentnumber: 011288989
     * name: Steve Jobs
     * studentnumber: 013672548
     * name:
     *
     * Alan Turing (017635727)
     * Linus Torvalds (011288989)
     * Steve Jobs (013672548)
     */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        String name = "";
        String studentNumber = "";

        while (true) {
            System.out.print("name: ");
            name = reader.nextLine();

            if (name.isEmpty())
                break;

            System.out.print("studentNumber: ");
            studentNumber = reader.nextLine();

            Student student = new Student(name, studentNumber);
            list.add(student);
        }

        for (Student x : list) {
            System.out.println(x.toString());
        }

        // ######################################################
        // Allow to search the list.

        System.out.print("Give search term: ");
        String search = reader.nextLine();

        System.out.println("Result:");
        for (Student x : list) {
            if (x.getName().contains(search)) {
                System.out.println(x);
            }
        }

        /*Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);*/

        /*Student Turing = new Student("Alan Turing", "017635727");
        Student Torvalds = new Student("Linus Torvalds", "011288989");
        Student Jobs = new Student("Steve Jobs", "013672548");*/

    }
}
