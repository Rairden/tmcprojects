import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Purchase> basketMap;

    ShoppingBasket() {
        this.basketMap = new HashMap<>();
    }

    public void add(String product, int price) {
        Purchase purchcase = new Purchase(product, 1, price);
        basketMap.putIfAbsent(product, purchcase);
    }

    public int price() {
        int total = 0;
        for (Purchase value : basketMap.values()) {
            total += value.price();
        }
        return total;
    }


}