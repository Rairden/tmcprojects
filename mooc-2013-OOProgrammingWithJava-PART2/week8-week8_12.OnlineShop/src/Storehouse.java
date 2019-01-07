import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> priceMap;
    private Map<String, Integer> stockMap;

    public Storehouse() {
        this.priceMap = new HashMap<>();
        this.stockMap = new HashMap<>();
    }

    public Set<String> products() {
        Set<String> set;
        set = priceMap.keySet();
        return set;
    }

    public void addProduct(String product, int price, int stock) {
        priceMap.putIfAbsent(product, price);
        stockMap.putIfAbsent(product, stock);
    }

    public int price(String product) {
        return priceMap.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return stockMap.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (stockMap.containsKey(product) && stockMap.get(product) > 0) {
            stockMap.put(product, stockMap.get(product) - 1);
            return true;
        } else {
            return false;
        }
    }



}