import java.util.HashMap;
import java.util.Scanner;

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

    public void printPlanes() {
        for (String key : planeToCapacity.keySet()) {
            System.out.println(key + " (" + translate(key) + " ppl)");
        }
    }

    public void printPlaneInfo(Scanner scan) {
        System.out.print("Give plane ID: ");
        String planeID = scan.nextLine();

        if (planeToCapacity.containsKey(planeID)) {
            System.out.println(planeID + " (" + planeToCapacity.get(planeID) + " ppl)\n");
        }
    }

}