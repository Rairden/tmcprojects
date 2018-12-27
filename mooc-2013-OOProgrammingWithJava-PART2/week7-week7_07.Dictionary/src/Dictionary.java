import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {

    private HashMap<String, String> hashMap;

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

    public HashMap<String, String> getHashMap() {
        return hashMap;
    }

    public ArrayList<String> translationList() {
        ArrayList<String> origList  = new ArrayList<String>();
        ArrayList<String> copyList  = new ArrayList<String>();

        origList.addAll(hashMap.keySet());

        for (String key : origList) {
            copyList.add(key + " = " + translate(key));
        }
        return copyList;
    }


}