import java.util.*;

public class Phonebook implements MultipleEntryDictionary {

    private Map<String, Set<Person>> phoneBook;
    private Person person;
    private Scanner scan;

    public Phonebook(Scanner scan) {
        this.phoneBook = new HashMap<>();
        this.scan = scan;
    }

    public void searchPhoneBook() {
        System.out.print("whose number: ");
        String name = scan.nextLine();

        if (phoneBook.containsKey(name)) {
            for (Set<Person> value : phoneBook.values()) {
                for (Person p : value) {
                    System.out.print(" ");
                    System.out.println((p.getPhoneNumber()));
                }
            }
        } else {
            System.out.println("  not found");
        }
    }

    public void addAddress() {
        System.out.print("whose address: ");
        String name = scan.nextLine();

        if (phoneBook.containsKey(name)) {

        }
    }

    @Override
    public void add(String word, Person entry) {
        if (!phoneBook.containsKey(word)) {
            phoneBook.put(word, new HashSet<Person>());
        }
            Set<Person> output = phoneBook.get(word);
            output.add(entry);

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
