import java.util.ArrayList;

public class Suitcase {

    public ArrayList<Thing> things = new ArrayList<>();
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() + totalWeight() <= maximumWeight) {
            things.add(thing);
        }
    }

    public Thing heaviestThing() {
        Thing heaviest;
        int heaviestKg = 0;
        if (things.size() == 0) { return null; }

        for (Thing x : things) {
            if (x.getWeight() >= heaviestKg) {
                heaviestKg = x.getWeight();
            }
        }
        for (Thing x : things) {
            if (x.getWeight() == heaviestKg) {
                heaviest = x;
                return heaviest;
            }
        }
        return null;
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing x : things) {
            totalWeight += x.getWeight();
        }
        return totalWeight;
    }

    public void printThings() {
        for (Thing x : things) {
            System.out.println(x.getName() + " (" + x.getWeight() + " kg)");
        }
    }

    public String toString() {
        // "0 things" or "1 things" is not proper English
        switch (things.size()) {
            case 0:
                return "empty \t (0 kg)";
            case 1:
                return "1 thing  ("  + totalWeight() + " kg)";
            default:
                return things.size() + " things (" + totalWeight() + " kg)";
        }
    }
}