
public class Purchase {

    private String  product;
    private int     amount;
    private int     unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product    = product;
        this.amount     = amount;
        this.unitPrice  = unitPrice;
    }

    public void increaseAmount() {
        amount++;
    }

    public int getAmount() {
        return amount;
    }

    public int price() {
        return amount * unitPrice;
    }

    @Override
    public String toString() {
        return product + ": " + amount;
    }
}