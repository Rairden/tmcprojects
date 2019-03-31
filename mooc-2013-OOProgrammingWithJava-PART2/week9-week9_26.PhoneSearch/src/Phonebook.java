import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phonebook implements DuplicateRemover {

    private Map<String, Set<String>> phoneBook;

    public Phonebook() {
        this.phoneBook = new HashMap<>();
    }



    @Override
    public void add(String characterString) {

    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return 0;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return null;
    }

    @Override
    public void empty() {

    }
}
