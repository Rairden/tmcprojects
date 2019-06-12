package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {

    private Map<String, String> dict;
    private File file;

    public MindfulDictionary() {
        dict = new HashMap<String, String>();
    }

    public MindfulDictionary(String path) {
        this();
        file = new File(path);
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                dict.put(parts[0], parts[1]);
            }
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return false;
    }

    public boolean save() {
        try {
            FileWriter writer = new FileWriter(file);
            for (String key : dict.keySet()) {
                writer.write(key.concat(":"));
                writer.write(translate(key));
                writer.write(10);
            }
            writer.close();
            return true;
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return false;
    }

    // allows for lookup in both directions
    public String translate(String word) {
        if (dict.containsKey(word)) {
            return dict.get(word);
        }
        for (Map.Entry<String, String> entry : dict.entrySet()) {
            if (entry.getValue().equals(word)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void add(String word, String translation) {
        if (dict.containsKey(word)) {
            return;
        }
        dict.put(word, translation);
    }

    // same as translate(), bi-directional
    public void remove(String word) {
        if (dict.containsKey(word)) {
            dict.remove(word);
            return;
        }
        if (dict.containsValue(word)) {
            dict.remove(translate(word));
        }
    }
}
