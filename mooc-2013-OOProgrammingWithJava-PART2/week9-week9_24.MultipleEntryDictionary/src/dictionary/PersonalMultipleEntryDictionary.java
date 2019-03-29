package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
        Set<String> temp = new HashSet<String>();

        if (dictionary.containsKey(word)) {
            for (Set<String> value : dictionary.values()) {
                if (dictionary.get(word).containsAll(value)) {
                    temp.add(value.toString());
                }
            }
        }
        return temp;
    }

    @Override
    public void remove(String word) {

    }
}
