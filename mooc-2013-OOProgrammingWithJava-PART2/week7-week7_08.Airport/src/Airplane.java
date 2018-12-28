import java.util.HashMap;

public class Airplane {

    private HashMap<String, Integer> planeToCapacity;
    //private Scanner scan;

    Airplane() {
        this.planeToCapacity = new HashMap<String, Integer>();
        //this.scan            = new Scanner(System.in);
    }

    public int translate(String planeID) {
        return planeToCapacity.get(planeID);
    }

    public void add(String planeID, int capacity) {
        planeToCapacity.put(planeID, capacity);
    }

    public int sizeOfHashMap() {
        return planeToCapacity.size();
    }

    public HashMap<String, Integer> getHashMap() {
        return planeToCapacity;
    }



}