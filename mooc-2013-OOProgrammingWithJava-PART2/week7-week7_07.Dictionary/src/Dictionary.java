import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {

    public HashMap<String, String> hashMap;

    public Dictionary() {
        this.hashMap = new HashMap<String, String>();
    }

    public String translate(String word) {
        return hashMap.get(word);
    }

    public void add(String word, String translation) {
        hashMap.put(word, translation);
    }

    public int amountOfWords() {
        return hashMap.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> origList      = new ArrayList<>();
        ArrayList<String> copyList  = new ArrayList<>();

        origList.addAll(hashMap.keySet());

        for (String key : origList) {
            copyList.add(key + " = " + translate(key));
        }
        return copyList;
    }





}