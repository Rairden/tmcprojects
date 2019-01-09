import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{

    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public void sort() {
        Collections.sort(cards);
        /** in sorted order, clubs highest.
         * 2 of Spades
         * 2 of Clubs
         * Q of Hearts
         * A of Clubs
         */
    }

    void add(Card card) {
        cards.add(card);
    }

    void print() {
        for (Card card1 : cards) {
            System.out.println(card1.toString());
        }
    }

    @Override
    public int compareTo(Hand o) {
        int thisTotal, otherTotal;
        thisTotal = otherTotal = 0;

        for (Card card : this.cards) {
            thisTotal += card.getValue();
        }

        for (Card card : o.cards) {
            otherTotal += card.getValue();
        }

        return thisTotal - otherTotal;
    }
}