import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Purchase> basketMap;

    public ShoppingBasket() {
        this.basketMap = new HashMap<>();
    }

    public void add(String product, int price) {

        if (basketMap.containsKey(product)) {
            int amount = basketMap.get(product).getAmount();
            Purchase purchase = new Purchase(product, amount, price);
            purchase.increaseAmount();
            basketMap.put(product, purchase);
        } else {
            Purchase purchase = new Purchase(product, 1, price);
            basketMap.put(product, purchase);
        }
    }

    public int price() {
        int total = 0;
        for (Purchase value : basketMap.values()) {
            total += value.price();
        }
        return total;
    }

    public void print() {
        for (Purchase p : basketMap.values()) {
            System.out.println(p.toString());
        }
    }

}