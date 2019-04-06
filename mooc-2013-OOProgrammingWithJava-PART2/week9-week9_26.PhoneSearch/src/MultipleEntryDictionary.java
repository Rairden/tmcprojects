import java.util.Set;

public interface MultipleEntryDictionary {

    void add(String word, Person entry);
    Set<Person> translate(String word);
    void remove();
}
