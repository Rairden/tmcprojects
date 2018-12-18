import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());

        System.out.println(cheese);
        System.out.println("########################################################################");
        // 100.2 ###################################################################################
        Library Library = new Library();

        Book cheese2 = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        Library.addBook(cheese2);

        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        Library.addBook(nhl);

        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        Library.printBooks();
        System.out.println("########################################################################");
        // 100.3 ###################################################################################
        Library Library2 =new Library();

        Library2.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library2.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library2.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library2.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        ArrayList<Book> result = Library2.searchByTitle("Cheese");
        for (Book book : result) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book : Library2.searchByPublisher("Penguin Group  ")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book : Library2.searchByYear(1851)) {
            System.out.println(book);
        }

    }
}