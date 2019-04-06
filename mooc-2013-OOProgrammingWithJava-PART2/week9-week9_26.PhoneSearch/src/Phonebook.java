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

        Person person = new Person(name);

        System.out.print("number: ");
        String number = scan.nextLine();

        person.setPhoneNumber(number);
        add(name, person);
    }

    /**
     * Prints a list of phone #'s
     * @param name the Person's name
     */
    public void searchByName(String name) {
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
        boolean found = false;

        for (Set<Person> personSet : phoneBook.values()) {
            for (Person person : personSet) {
                if (person.getPhoneNumber().equals(number)) {
                    // this was only way I could getKey of person, unfortunately
                    for (Map.Entry<String, Set<Person>> entry : phoneBook.entrySet()) {
                        System.out.println(" " + entry.getKey());
                        break;
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
                if (person.getStreetAddr().isEmpty() && person.getCity().isEmpty()) {
                    person.setStreetAddr(streetAddr);
                    person.setCity(city);
                    return;
                } else {  // streetAddr already exists for Person; make new one.
                    Person person2 = new Person(name);
                    person2.setStreetAddr(streetAddr);
                    person2.setCity(city);
                    return;
                }
            }
        } else {  // if key does NOT exist, create new Key
            Person person4 = new Person(name);
            person4.setStreetAddr(streetAddr);
            person4.setCity(city);
            add(name, person4);
        }
    }

    public void searchInfo(String name) {
        boolean foundPhoneNumber = false;
        boolean foundAddress = false;

        if (!phoneBook.containsKey(name)) {
            System.out.println("  not found");
        } else {
            Set<Person> personSet  = translate(name);
            for (Person person : personSet) {
                if (!person.getStreetAddr().isEmpty()) {
                    System.out.println("  address: " + person.getStreetAddr() + " " + person.getCity());
                    foundAddress = true;
                }
            }

            if (!foundAddress) {
                System.out.println("  address unknown");
            }

            for (Person person : personSet) {
                if (!person.getPhoneNumber().isEmpty()) {
                    System.out.println("  phone numbers: ");
                    System.out.println("   " + person.getPhoneNumber());
                    foundPhoneNumber = true;
                }
            }

            if (!foundPhoneNumber) {
                System.out.println("  phone number not found");
            }
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
    public void remove() {
        System.out.print("whose information: ");
        String name = scan.nextLine();

        // if the HashMap key exists, delete all <Key, Value> data.
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
        } else {
            System.out.println("  not found");
        }
    }

    public void filterSearch() {
        System.out.print("keyword (if empty, all listed): ");
        String keyword = scan.nextLine();
        System.out.println();

        List<String> list = new ArrayList<String>();

        // iterate over keys. If contains search word, add to list
        for (String key : phoneBook.keySet()) {
            if (key.contains(keyword)) {
                list.add(key);
            }
        }

        // iterate over values. If contains search word, add to list if not already there
        for (Set<Person> personSet : phoneBook.values()) {
            for (Person person : personSet) {
                if ((person.getStreetAddr().contains(keyword)
                        || person.getCity().contains(keyword))
                        && !list.contains(person.getName())) {
                    list.add(person.getName());
                }
            }
        }

        // sort your Person names alphabetically
        Collections.sort(list);

        if (list.size() == 0) {
            System.out.println(" keyword not found");
        }

        // you have all the data now (keys). List all addresses first, then all phone #'s
        for (String name : list) {
            System.out.println(" " + name);
            searchInfo(name);
            System.out.println();
        }
    }
}
