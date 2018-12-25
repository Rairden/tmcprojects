import java.util.ArrayList;

public class Suitcase {

    //private Thing thing = new Thing();    // this works too.
    private int suitcaseWeight;
    private int cnt;
    public ArrayList<Thing> things = new ArrayList<>();
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() + totalWeight() <= maximumWeight) {
            things.add(thing);
            suitcaseWeight += thing.getWeight();
            cnt++;
        }
    }

    public int totalWeight() {
        return suitcaseWeight;
    }

    public void printThings() {
        for (Thing x : things) {
            System.out.println(x.getName() + " (" + x.getWeight() + " kg)");
        }
    }

    public String toString() {
        // "0 things" or "1 things" is not proper English
        switch (cnt) {
            case 0:
                return "empty \t(0 kg)";
            case 1:
                return cnt + " thing ("  + totalWeight() + " kg)";
            default:
                return cnt + " things (" + totalWeight() + " kg)";
        }
    }
}