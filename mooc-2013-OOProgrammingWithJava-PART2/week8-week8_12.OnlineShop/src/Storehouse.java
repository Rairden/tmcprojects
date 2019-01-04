import java.util.HashMap;
import java.util.Map;

public class Storehouse {

    public String product;
    public int price;
    public int stock;
    private Map<String, Integer> map;

    public Storehouse() {
        this.map = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        map.put(product, price);
    }

    public int price(String product) {
        return map.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return 0;
    }

    public boolean take(String product) {
        return false;
    }





}