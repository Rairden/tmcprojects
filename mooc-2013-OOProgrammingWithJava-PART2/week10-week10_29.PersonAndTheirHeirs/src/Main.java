import people.Person;
import people.Student;
import people.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);
        printLine();    // ------------------

        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());
        printLine();    // ------------------

        Student erik = new Student("Erik", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(erik);
        erik.study();
        System.out.println(erik);
        printLine();    // ------------------

        Teacher pekka2 = new Teacher("Pekka2 Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko2 = new Teacher("Esko2 Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println(pekka2);
        System.out.println(esko2);

        Student ryan = new Student("Ryan", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            ryan.study();
        }
        System.out.println(ryan);
        printLine();    // ------------------

        List people = new ArrayList();
        people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200));
        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));

        printDepartment(people);

    }


    public static void printDepartment(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static void printLine() {
        System.out.println("--------------------------------------------");
    }
}
