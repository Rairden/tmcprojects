import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library = new ArrayList<Book>();

    public void addBook(Book newBook) {
        this.library.add(new Book(newBook.title(), newBook.publisher(), newBook.year()));
    }

    public void printBooks() {
        for (Book book : library) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String titleSearch) {
        ArrayList<Book> found = new ArrayList<Book>();
        // iterate the list of books and add all the matching books to the list found
        for (Book book : library) {
            if (StringUtils.included(book.title(), titleSearch)) {
                found.add(book);  // Book found!  add it.
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisherSearch) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : library) {
            if (StringUtils.included(book.publisher(), publisherSearch)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int yearSearch) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : library) {
            if (book.year() == yearSearch) {
                found.add(book);
            }
        }
        return found;
    }

}