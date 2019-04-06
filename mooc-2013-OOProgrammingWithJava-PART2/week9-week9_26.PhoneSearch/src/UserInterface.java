import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private Phonebook phoneBook;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.phoneBook = new Phonebook(scan);
    }

    public void start() {
        menu();

        while (true) {
            System.out.print("command: ");
            String cmd = scan.nextLine();

            if (cmd.equals("x") || cmd.equals("")) {
                return;
            }

            int command = Integer.parseInt(cmd);

            switch (command) {
                case 1:
                    phoneBook.addPerson();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("whose number: ");
                    String name = scan.nextLine();
                    phoneBook.searchByName(name);
                    System.out.println();
                    break;
                case 3:
                    phoneBook.searchByNumber();
                    System.out.println();
                    break;
                case 4:
                    phoneBook.addAddress();
                    System.out.println();
                    break;
                case 5:
                    System.out.print("whose information: ");
                    String name2 = scan.nextLine();
                    phoneBook.searchInfo(name2);
                    System.out.println();
                    break;
                case 6:
                    phoneBook.remove();
                    System.out.println();
                    break;
                case 7:
                    phoneBook.filterSearch();
                    System.out.println();
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
                " x quit\n\n");
    }

}
