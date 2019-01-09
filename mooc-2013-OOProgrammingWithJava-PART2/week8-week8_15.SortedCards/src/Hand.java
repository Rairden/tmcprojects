import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public void sort() {            /* in sorted order, Ace of clubs highest */
        Collections.sort(cards);    // 2 of Spades
    }                               // 2 of Clubs
                                    // Q of Hearts
                                    // A of Clubs

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card c : cards) {
            System.out.println(c.toString());
        }
    }

    @Override
    public int compareTo(Hand o) {
        int thisTotal  = 0;
        int otherTotal = 0;

        for (Card card : this.cards) {
            thisTotal += card.getValue();
        }

        for (Card card : o.cards) {
            otherTotal += card.getValue();
        }

        return thisTotal - otherTotal;
    }

    public void sortAgainstSuit() {
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
}