public class Main {

    public static void main(String[] args) {
        HangmanLogic logic = new HangmanLogic("parameter");
        HangmanUserInterface game = new HangmanUserInterface(logic);
        game.start();
        logic.guessLetter("X");
        logic.guessLetter("R");
        logic.guessLetter("P");
        logic.guessLetter("S");
        logic.guessLetter("F");
        logic.guessLetter("A");
        logic.guessLetter("M");
        logic.guessLetter("E");
        logic.guessLetter("D");
    }
}
