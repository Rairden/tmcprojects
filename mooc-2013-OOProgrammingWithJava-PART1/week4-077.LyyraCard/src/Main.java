
import java.util.Scanner;

public class Main {
    /**
     * Exercise 77.6: Multiple cards
     * Write a main method that does the following:
     *
     * Creates a LyyraCard for Pekka with initial balance of 20 euros
     * Creates a LyyraCard for Brian with initial balance of 30 euros
     * Pekka buys gourmet lunch
     * Brian buys economical lunch
     * cards are printed (both on their own row, starting with the name of the card owner)
     * Pekka loads 20 euros
     * Brian buys gourmet lunch
     * cards are printed (both on their own row, starting with the name of the card owner)
     * Pekka buys economical lunch
     * Pekka buys economical lunch
     * Brian loads 50 euros
     * cards are printed (both on their own row, starting with the name of the card owner)
     */
    public static void main(String[] args) {

        LyyraCard Pekka = new LyyraCard(20);
        LyyraCard Brian = new LyyraCard(30);

        Pekka.payGourmet();
        Brian.payEconomical();
        System.out.println("Pekka: " + Pekka);
        System.out.println("Brian: " + Brian);

        Pekka.loadMoney(20);
        Brian.payGourmet();
        System.out.println("Pekka: " + Pekka);
        System.out.println("Brian: " + Brian);

        Pekka.payEconomical();
        Pekka.payEconomical();
        Brian.loadMoney(50);

        System.out.println("Pekka: " + Pekka);
        System.out.println("Brian: " + Brian);

    }

}
