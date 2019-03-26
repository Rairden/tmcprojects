package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.Palindromi;

public class WordInspection {

    private File file;

    public WordInspection(File file) {
        this.file = file;
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
     * @return A list of strings of the file containing the char 'z'.
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

    /**
     * @return A list of all the Finnish words of the file which end in l (e.g, camel)
     */
    public List<String> wordsEndingInL() throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        List<String> list = new ArrayList<String>();

        while (reader.hasNext()) {
            String nextWord = reader.next();

            if (nextWord.endsWith("l") || nextWord.endsWith("L")) {
                list.add(nextWord);
            }
        }
        return list;
    }

    /**
     * @return A list of all the palindrome words of the file.
     */
    public List<String> palindromes() throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        List<String> list = new ArrayList<String>();

        while (reader.hasNext()) {
            String nextWord = reader.next();

            if (Palindromi.palindrome(nextWord)) {
                list.add(nextWord);
            }
        }
        return list;
    }

    /**
     * @return A list of all the words of the file which contain all Finnish vowels (aeiouyäö).
     * @throws FileNotFoundException if file not found
     */
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        List<String> list = new ArrayList<String>();

        while (reader.hasNext()) {
            String nextWord = reader.next();

            if (isFinnishVowel(nextWord)) {
                list.add(nextWord);
            }
        }
        return list;
    }

    public boolean isFinnishVowel(String word) {
        return (word.contains("a") && word.contains("e") && word.contains("i") &&
                word.contains("o") && word.contains("u") && word.contains("y") &&
                word.contains("ä") && word.contains("ö"));
    }

}
