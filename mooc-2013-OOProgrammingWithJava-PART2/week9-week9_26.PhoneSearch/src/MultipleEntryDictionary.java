import java.util.Set;

public interface MultipleEntryDictionary {
    boolean add(String word, Person entry);
    Set<Person> translate(String word);
    void remove(String word);
}
