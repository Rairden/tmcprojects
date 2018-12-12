public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        if (word.contains(letter)) {
            // They guessed it right!
            guessedLetters += letter;
        } else if (guessedLetters.contains(letter)) {
            // already guessed that letter.  Do nothing.
        } else {
            guessedLetters += letter;
            numberOfFaults++;
        }
        // if the letter has already been guessed, nothing happens
        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        // create the hidden word by iterating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with "_" in the hidden word

        String str = "";

        for (int i = 0; i < word.length(); i++) {

            char tempChar = word.charAt(i);
            String x = "";
            String tempStr = x + tempChar;

            if (guessedLetters().contains(tempStr)) {
                str += tempStr;
            } else {
                str += "_";
            }
        }

        // return the hidden word at the end
        return str;
    }
}