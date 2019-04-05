import java.util.*;

public class Phonebook implements MultipleEntryDictionary {

    private Map<String, Set<Person>> phoneBook;
    private Scanner scan;

    public Phonebook(Scanner scan) {
        this.phoneBook = new HashMap<>();
        this.scan = scan;
    }

    public void addPerson() {
        System.out.print("whose number: ");
        String name = scan.nextLine();

        Person person = new Person();

        System.out.print("number: ");
        String number = scan.nextLine();

        person.setPhoneNumber(number);
        add(name, person);
    }

    // prints list of phone #'s
    public void searchByName() {
        System.out.print("whose number: ");
        String name = scan.nextLine();

        if (phoneBook.containsKey(name)) {
            Set<Person> personSet  = translate(name);
            for (Person person : personSet) {
                System.out.println(" " + person.getPhoneNumber());
            }
        } else {
            System.out.println("  not found");
        }
    }

    // prints names belonging to phone #
    public void searchByNumber() {
        System.out.print("number: ");
        String number = scan.nextLine();
        Boolean found = false;

        for (Set<Person> value : phoneBook.values()) {
            for (Person person : value) {
                if (person.getPhoneNumber().equals(number)) {
                    // this was only way I could getKey of person, unfortunately
                    for (Map.Entry<String, Set<Person>> entry : phoneBook.entrySet()) {
                        System.out.println(" " + entry.getKey());
                    }
                    found = true;
                }
            }
            if (!found) {
                System.out.println("  not found");
            }
        }
    }

    public void addAddress() {
        System.out.print("whose address: ");
        String name = scan.nextLine();

        System.out.print("street: ");
        String streetAddr = scan.nextLine();

        System.out.print("city: ");
        String city = scan.nextLine();

        if (phoneBook.containsKey(name)) {
            Set<Person> personSet  = translate(name);
            for (Person person : personSet) {
                // if no streetAddr exists, add one.
                if (person.getStreetAddr() == null || person.getStreetAddr().isEmpty()) {
                    person.setStreetAddr(streetAddr);
                    person.setCity(city);
                    return;
                } else {  // streetAddr already exists for Person; make new one.
                    Person person2 = new Person();
                    person2.setStreetAddr(streetAddr);
                    return;
                }
            }
        } else {  // if key does NOT exist, add Person/key
            Person person = new Person();
            add(name, person);
            person.setStreetAddr(streetAddr);
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
