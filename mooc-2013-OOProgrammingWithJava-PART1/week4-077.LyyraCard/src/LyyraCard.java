import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class LyyraCard {
    /**
     * Then implement the LyyraCard constructor that gets the starting balance of the card as parameter.
     * The card saves the balance in the object variable balance. Implement also the toString method
     * that returns a string of the form "The card has X euros".
     */
    private final double MAXIMUMBALANCE = 150;      // the max balance is 150 Euros
    private double balance;

    public LyyraCard(double startingBal) {
        this.balance = startingBal;
    }

    public void payEconomical() {
        // Method payEconomical should decrease the balance by 2.50 euros and method payGourmet by 4.00 euros.
        if (balance >= 2.5) {
            balance = balance - 2.5;
        }
    }

    public void payGourmet() {
        if (balance >= 4) {
            balance = balance - 4;
        }
    }

    public void loadMoney(double amount) {
        /* The method should increase the balance of the card by the given amount. However, the maximum balance
         * on a card is 150 euros. In case the balance after loading money would be more than that, it should be truncated to 150 euros.
         */
        if (amount < 0) {
            return;
        }
        if (balance + amount >= MAXIMUMBALANCE) {
            balance = MAXIMUMBALANCE;
        } else {
            balance = balance + amount;
        }
    }

    @Override
    public String toString() {
        return "The card has " + balance + " euros";
    }
}
