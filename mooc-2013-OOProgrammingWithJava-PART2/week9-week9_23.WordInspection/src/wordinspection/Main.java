package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt

        WordInspection wordInspection = new WordInspection(file);
        System.out.println(wordInspection.wordCount());
        wordInspection.wordsContainingZ();
        wordInspection.wordsEndingInL();
        wordInspection.palindromes();
        wordInspection.wordsWhichContainAllVowels();
    }
}
