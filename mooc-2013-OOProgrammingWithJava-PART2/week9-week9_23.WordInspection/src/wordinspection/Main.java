package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

import main.Palindromi;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt

        WordInspection wordInsp = new WordInspection(file);
        System.out.println(wordInsp.wordCount());
        wordInsp.wordsContainingZ();
    }
}
