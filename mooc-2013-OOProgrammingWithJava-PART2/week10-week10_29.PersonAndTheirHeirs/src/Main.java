import people.Person;
import people.Student;

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

        Student erik = new Student("erik", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(erik);
        erik.study();
        System.out.println(erik);
        printLine();    // ------------------




    }

    private static void printLine() {
        System.out.println("--------------------------------------------");
    }
}
