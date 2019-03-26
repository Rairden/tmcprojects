package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import file.*;
import main.Palindromi;

public class WordInspection {

    private File file;

    public WordInspection(File file) {
        this.file   = file;
    }

    /**
     * @return the number of words in a file.
     */
    public int wordCount() throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        int wordCount = 0;

        while (reader.hasNext()) {
            wordCount++;
            reader.next();
        }
        return wordCount;
    }

    /**
     * @return A list of strings containing the char 'z'.
     */
    public List<String> wordsContainingZ() throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        List<String> list = new ArrayList<String>();

        while (reader.hasNext()) {
            String nextWord = reader.next();

            if (nextWord.contains("z") || nextWord.contains("Z")) {
                list.add(nextWord);
            }
        }
        return list;
    }


}
