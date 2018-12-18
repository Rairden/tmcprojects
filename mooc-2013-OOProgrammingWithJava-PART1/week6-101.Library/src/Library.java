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
            x.toString();
        }
    }

}