
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private final double ECONPRICE= 2.50;
    private final double GOURMETPRICE = 4.00;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        /* can be used to load cash to Lyyra Cards. When a certain amount is
        loaded to the card, the amount stored in the register increases
        correspondingly. Remember that the amount to be loaded needs to be positive!
        */
        // Makes no sense.  Why load to card, then also load to register same amt?

        if (sum > 0) {
            card.loadMoney(sum);
            cashInRegister += sum;
        } else {}
    }

    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance() >= ECONPRICE) {
            economicalSold++;
            card.loadMoney(-ECONPRICE);
            return true;
        } else return false;
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance() >= GOURMETPRICE) {
            gourmetSold++;
            card.loadMoney(-GOURMETPRICE);
            return true;
        } else return false;
    }

    //########################################################################

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven >= ECONPRICE) {
            economicalSold++;
            cashInRegister += ECONPRICE;
            return cashGiven - ECONPRICE;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven >= GOURMETPRICE) {
            gourmetSold++;
            cashInRegister += GOURMETPRICE;
            return cashGiven - GOURMETPRICE;
        } else {
            return cashGiven;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
