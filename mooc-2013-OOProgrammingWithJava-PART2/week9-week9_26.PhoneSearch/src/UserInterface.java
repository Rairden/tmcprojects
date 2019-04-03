import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private Phonebook phoneBook;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.phoneBook = new Phonebook(scan);
    }

    public void start() {

        while (true) {
            menu();
            String cmd = scan.nextLine();

            int command = Integer.parseInt(cmd);

            switch (command) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    phoneBook.searchPhoneBook();
                    break;
                case 3:
                    //
                    break;
                case 4:
                    //
                    break;
                case 5:
                    //
                    break;
                case 6:
                    //
                    break;
                case 7:
                    //
                    break;

                default:
                    break;
            }


        }

    }

    public static void menu() {
        System.out.print("phone search\n" +
                "available operations:\n" +
                " 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit\n\n" +
                "command: ");
    }

    public void addPerson() {
        System.out.print("whose number: ");
        String name = scan.nextLine();

        Person person = new Person();

        System.out.print("number: ");
        String number = scan.nextLine();

        person.setPhoneNumber(number);
        phoneBook.add(name, person);

    }

}
