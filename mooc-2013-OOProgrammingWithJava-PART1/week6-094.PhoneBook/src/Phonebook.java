import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> phoneBook = new ArrayList<Person>();

    public Phonebook() {
        ArrayList<Person> book = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        this.phoneBook.add(new Person(name, number));
    }

    // returns the phone # related to the input name
    public String searchNumber(String name) {
        for (Person x : phoneBook) {
            if (x.getName().equals(name)) {
                return x.getNumber();
            }
        }
        return "number not known";
    }

    public void printAll() {
        for (Person x  : phoneBook) {
            System.out.println(x);
        }
    }
}