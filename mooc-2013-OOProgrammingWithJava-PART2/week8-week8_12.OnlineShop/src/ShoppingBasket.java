import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Purchase> basketMap;

    ShoppingBasket() {
        this.basketMap = new HashMap<>();
    }

    public void add(String product, int price) {
        Purchase purchase = new Purchase(product, 1, price);
        basketMap.putIfAbsent(product, purchase);
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