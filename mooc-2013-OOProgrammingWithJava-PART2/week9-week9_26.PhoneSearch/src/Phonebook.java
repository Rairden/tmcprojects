import java.util.*;

public class Phonebook implements MultipleEntryDictionary {

    private Map<String, Set<Person>> phoneBook;
    private Scanner scan;

    public Phonebook(Scanner scan) {
        this.phoneBook = new HashMap<>();
        this.scan = scan;
    }

    public void searchPhoneBook() {
        System.out.print("whose number: ");
        String name = scan.nextLine();

        if (phoneBook.containsKey(name)) {
            Set<Person> t = new HashSet<>();
            t = translate(name);
        }
    }

    @Override
    public boolean add(String word, Person entry) {
        if (!phoneBook.containsKey(word)) {
            phoneBook.put(word, new HashSet<Person>());
            return true;
        } else {
            Set<Person> output = phoneBook.get(word);
            output.add(entry);
            return false;
        }
    }

    @Override
    public Set<Person> translate(String word) {
        if (!phoneBook.containsKey(word)) {
            return null;
        }
        return phoneBook.get(word);
    }

    @Override
    public void remove(String word) {

    }
}
