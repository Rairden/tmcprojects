package dictionary;

import java.util.*;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> dictionary;

    public PersonalMultipleEntryDictionary() {
        this.dictionary = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        // note that when we create a new user we have first to map an empty set to it
        if (!dictionary.containsKey(word)) {
            dictionary.put(word, new HashSet<String>());
        }
        Set<String> output = dictionary.get(word);
        output.add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if (!dictionary.containsKey(word)) {
            return null;
        }

        return dictionary.get(word);
    }

    @Override
    public void remove(String word) {
        dictionary.remove(word);
    }
}
