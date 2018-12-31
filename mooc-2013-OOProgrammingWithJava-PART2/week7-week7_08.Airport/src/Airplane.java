import java.util.HashMap;

public class Airplane {

    public HashMap<String, Integer> planeToCapacity;

    public Airplane() {
        this.planeToCapacity = new HashMap<String, Integer>();
    }

    public int translate(String planeID) {
        return planeToCapacity.get(planeID);
    }

    public void add(String planeID, int capacity) {
        planeToCapacity.put(planeID, capacity);
    }

    public HashMap<String, Integer> getHashMap() {
        return planeToCapacity;
    }

}