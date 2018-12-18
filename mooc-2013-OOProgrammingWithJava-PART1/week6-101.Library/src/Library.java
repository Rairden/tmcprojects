import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library = new ArrayList<Book>();

    public Library() {
    }

    public void addBook(Book newBook) {
        this.library.add(new Book(newBook.title(), newBook.publisher(), newBook.year()));
    }

    public void printBooks() {
        for (Book x : library) {
            System.out.println(x);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        // iterate the list of books and add all the matching books to the list found
        for (Book x : library) {
            if (x.title().contains(title)) {
                found.add(x);
                return found;
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        // iterate the list of books and add all the matching books to the list found
        for (Book x : library) {
            if (x.publisher().contains(publisher)) {
                found.add(x);
                return found;
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        // iterate the list of books and add all the matching books to the list found
        for (Book x : library) {
            if (x.year() == year) {
                found.add(x);
                return found;
            }
        }
        return found;
    }

}